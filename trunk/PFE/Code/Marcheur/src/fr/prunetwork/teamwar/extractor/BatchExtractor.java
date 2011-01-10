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
import fr.prunetwork.teamwar.entities.StoreEntities;
import fr.prunetwork.teamwar.entities.Tracability;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class BatchExtractor {

    private Collection<Tracability> tracabilitys;

    public BatchExtractor(Collection<Tracability> tracabilitys) {
        this.tracabilitys = tracabilitys;
    }

    private static void createBatchTracabilityRelation(
            Collection<Tracability> tracabilitys,
            Map<String, Tracability> batchTracabilityMap) {
        //populate the index of batch
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {

            Tracability tracability = it.next();

            batchTracabilityMap.put(tracability.getBatch(), tracability);
        }
    }

    private static void createUniqueBatchesFromTracability(
            Map<String, Tracability> batchTracabilityMap,
            Collection<Batch> batchs,
            Map<String, Batch> batchMap) {
        //create batches
        for (Iterator<String> it = batchTracabilityMap.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            Batch batch = new Batch(batchTracabilityMap.get(key).getBatch(),
                    batchTracabilityMap.get(key).getTechnology());
            batchs.add(batch);
            batchMap.put(batch.getName(), batch);
        }
    }

    private static void populateEachBatchesWithItsTracability(Collection<Tracability> tracabilitys, Map<String, Batch> batchMap) {
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {

            Tracability tracability = it.next();
            if (batchMap.get(tracability.getBatch()) != null) {
                batchMap.get(tracability.getBatch()).addTracability(tracability);
            }
        }
    }

    /**
     * @return the tracabilitys
     */
    public Collection<Tracability> getTracabilitys() {
        return Collections.unmodifiableCollection(tracabilitys);
    }

    public Collection<Batch> extract() {
        Collection<Batch> batchs = new ArrayList<Batch>();

        //      Create a HashSet which allows no duplicates
        Map<String, Tracability> batchTracabilityMap = new HashMap<String, Tracability>();

        Map<String, Batch> batchMap = new HashMap<String, Batch>();


        createBatchTracabilityRelation(tracabilitys, batchTracabilityMap);

        //We are not interrested in an event about a non-existing batch
        batchTracabilityMap.remove(Constants.DEFAULT_VALUE_WHEN_EMPTY_ROW);

        createUniqueBatchesFromTracability(batchTracabilityMap, batchs, batchMap);
        populateEachBatchesWithItsTracability(tracabilitys, batchMap);
        StoreEntities.addAllBatch(batchs);
        return batchs;
    }
}
