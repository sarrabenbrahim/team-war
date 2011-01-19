/*
 *  Copyright (C) 2010 Team-W@R (team-war@prunetwork.fr)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.prunetwork.teamwar;

import fr.prunetwork.teamwar.entities.Batch;
import fr.prunetwork.teamwar.entities.StoreEntities;
import fr.prunetwork.teamwar.entities.Tracability;
import fr.prunetwork.teamwar.entities.Workstation;
import fr.prunetwork.teamwar.extractor.BatchAndWorkstationLinkExtractor;
import fr.prunetwork.teamwar.extractor.BatchExtractor;
import fr.prunetwork.teamwar.extractor.WorkstationExtractor;
import fr.prunetwork.teamwar.storage.reader.ExtractDataFromFile;
import fr.prunetwork.teamwar.storage.writer.StoreDataToFile;
import fr.prunetwork.teamwar.utilities.MyDate;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 * @author NAIT BELKACEM Abdelali
 */
public class Marcheur {

    private String fichier;
    private StoreDataToFile sdtf;
    private Collection<Tracability> tracabilitys;
    private WorkstationExtractor we;
    private BatchExtractor be;
    private Collection<Workstation> workstations;
    private Collection<Batch> batchs;

    public Marcheur() {
        fichier = Constants.SHORT_FILE;
 //       fichier = Constants.LONG_FILE;
        sdtf = new StoreDataToFile("./ResultForExcel.txt");

        tracabilitys = ExtractDataFromFile.createTracabilityCollection(fichier);

        we = new WorkstationExtractor(tracabilitys);
        workstations = we.extract();

        be = new BatchExtractor(tracabilitys);
        batchs = be.extract();

        BatchAndWorkstationLinkExtractor batchAndWorkstationLinkExtractor= new BatchAndWorkstationLinkExtractor();
        batchAndWorkstationLinkExtractor.link();
        Double maxNumberOfSteps = StoreEntities.getNumberMaxOfSteps();
        MyDate lastDate = StoreEntities.getLastDate();
        MyDate firstDate = StoreEntities.getFirstDate();
        System.out.println(firstDate.toString());
        System.out.println(lastDate.toString());
        int nunmberOfProcessDone = 0;
        for (Iterator<Batch> it = batchs.iterator(); it.hasNext();) {
            Batch batch = it.next();

            DecimalFormat decimalFormat=new DecimalFormat();
            decimalFormat.setMaximumFractionDigits ( 4 ) ; //arrondi à 2 chiffres apres la virgules
            decimalFormat.setMinimumFractionDigits ( 4 ) ;
            Double percentOfavencement = new Double(batch.getTracabilitys().size()/maxNumberOfSteps);
            sdtf.add(decimalFormat.format(batch.fiabilityMSLAndMSESafe(lastDate)) + ";" + decimalFormat.format(percentOfavencement) + "\n");
            System.out.println("Nombre de batch traité :" + nunmberOfProcessDone++ + " / " + batchs.size());
        }

        try {
            sdtf.commit();
        } catch (IOException ex) {
            Logger.getLogger(Marcheur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new Marcheur();
    }
}
