/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.entities;

import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author garciaf
 * @author NAIT BELKACEM Abdelali
 */
public class StoreEntities {

    private static Collection<Workstation> workstations = new ArrayList<Workstation>();
    private static Collection<Batch> batchs = new ArrayList<Batch>();
    private static Map<String, Workstation> workstationMap = new HashMap<String, Workstation>();
    private static Map<String, Batch> batchMap = new HashMap<String, Batch>();
    private static Collection<Tracability> tracabilitys = new ArrayList<Tracability>();

    public static void addAllBatch(Collection<Batch> batches) {
        StoreEntities.batchs.addAll(batches);
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

    public static Collection<Batch> getBatchs() {
        return batchs;
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
    public static MyDate getFirstDate(){
          Vector<Tracability> vector=new Vector<Tracability>(tracabilitys);
          return vector.get(0).getDate();
    }
    public static Double getNumberMaxOfSteps(){
        Double max = new Double(0);
        for (Iterator<Batch> it = batchs.iterator(); it.hasNext();) {
            Batch batch = it.next();
            Double numberOfBachSteps =new Double(batch.getTracabilitys().size());
            if (numberOfBachSteps>max){
                max=numberOfBachSteps;
            }

        }
        return max;
    }
}
