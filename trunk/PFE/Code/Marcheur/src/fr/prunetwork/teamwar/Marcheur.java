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
import fr.prunetwork.teamwar.entities.Tracability;
import fr.prunetwork.teamwar.entities.Workstation;
import fr.prunetwork.teamwar.extractor.BatchExtractor;
import fr.prunetwork.teamwar.extractor.WorkstationExtractor;
import fr.prunetwork.teamwar.storage.reader.ExtractDataFromFile;
import fr.prunetwork.teamwar.storage.writer.StoreDataToFile;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class Marcheur {

    public static void main(String[] args) {
        String fichier = Constants.SHORT_FILE;
//        String fichier = Constants.LONG_FILE;
        StoreDataToFile sdtf = new StoreDataToFile("/home/garciaf/Bureau/FileCCCC");

        Collection<Tracability> tracabilitys = ExtractDataFromFile.createTracabilityCollection(fichier);

        WorkstationExtractor we = new WorkstationExtractor(tracabilitys);
        Collection<Workstation> workstations = we.extract();

        BatchExtractor be = new BatchExtractor(tracabilitys);
        Collection<Batch> batchs = be.extract();

        for (Iterator<Batch> it = batchs.iterator(); it.hasNext();) {
            Batch batch = it.next();

            sdtf.add(batch.simpleFiability() + " " + batch.description()+"\n");
        }
        try {
            sdtf.commit();
        } catch (IOException ex) {
            Logger.getLogger(Marcheur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
