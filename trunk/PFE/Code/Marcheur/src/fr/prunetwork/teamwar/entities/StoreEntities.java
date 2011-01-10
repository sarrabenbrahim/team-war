/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author garciaf
 */
public class StoreEntities {

    private static Collection<Workstation> workstations = new ArrayList<Workstation>();
    private static Collection<Batch> batches = new ArrayList<Batch>();
    private static Map<String, Workstation> workstationMap = new HashMap<String, Workstation>();
    private static Map<String, Batch> batchMap = new HashMap<String, Batch>();

    public static void addAllBatch(Collection<Batch> batches) {
        StoreEntities.batches.addAll(batches);
        for (Batch batch : batches) {
            batchMap.put(batch.getName(), batch);
        }
    }

    public static void addAllWorkstation(Collection<Workstation> workstations) {
        StoreEntities.workstations.addAll(workstations);
        for (Workstation workstation : workstations) {
            workstationMap.put(workstation.getName(), workstation);
        }
    }

    public static Batch getBatch(String name) {
        return batchMap.get(name);
    }

    public static Workstation getWorkstation(String name) {
        return workstationMap.get(name);
    }
}
