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
package fr.prunetwork.teamwar.extractor;

import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.entities.Batch;
import fr.prunetwork.teamwar.entities.Tracability;
import fr.prunetwork.teamwar.storage.reader.ExtractDataFromFile;
import java.util.Collection;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class BatchExtractorTest {

    public static void main(String args[]) {
        String fichier = Constants.SHORT_FILE;
//        String fichier = Constants.LONG_FILE;


        Collection<Tracability> tracabilitys = ExtractDataFromFile.createTracabilityCollection(fichier);

        BatchExtractor batchExtractor = new BatchExtractor(tracabilitys);

        Collection<Batch> batches = batchExtractor.extract();

        for (Batch batch : batches) {
            System.out.println(batch.description());
        }
    }
}
