/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.entities;

import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.omg.CORBA.TRANSACTION_MODE;

/**
 *
 * @author garciaf
 * @author NAIT BELKACEM Abdelali
 */
public class StoreEntities {

    private static Collection<Workstation> workstations = new ArrayList<Workstation>();
    private static Collection<Batch> batches = new ArrayList<Batch>();
    private static Map<String, Workstation> workstationMap = new HashMap<String, Workstation>();
    private static Map<String, Batch> batchMap = new HashMap<String, Batch>();
    private static Collection<Tracability> tracabilitys = new ArrayList<Tracability>();

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
      public static void addAllTracability(Collection<Tracability> tracabilitys) {
        StoreEntities.tracabilitys.addAll(tracabilitys);
    }
    public static MyDate  getLastDate(){
          Vector<Tracability> vector=new Vector<Tracability>(tracabilitys);
          return vector.get(vector.size()-1).getDate();

    }
}
