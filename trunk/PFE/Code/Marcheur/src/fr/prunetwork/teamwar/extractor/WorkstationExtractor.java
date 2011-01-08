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
import fr.prunetwork.teamwar.entities.Workstation;
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
public class WorkstationExtractor {

    private Collection<Tracability> tracabilitys;

    public WorkstationExtractor(Collection<Tracability> tracabilitys) {
        this.tracabilitys = tracabilitys;
    }

    private static void createWorkstationTracabilityRelation(
            Collection<Tracability> tracabilitys,
            Map<String, Tracability> WorkstationTracabilityMap) {
        //populate the index of Workstation
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {

            Tracability tracability = it.next();

            WorkstationTracabilityMap.put(tracability.getWorkstationID(), tracability);
        }
    }

    private static void createUniqueWorkstationesFromTracability(
            Map<String, Tracability> WorkstationTracabilityMap,
            Collection<Workstation> Workstations,
            Map<String, Workstation> WorkstationMap) {
        //create Workstationes
        for (Iterator<String> it = WorkstationTracabilityMap.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            Workstation Workstation = new Workstation(WorkstationTracabilityMap.get(key).getWorkstationID());
            Workstations.add(Workstation);
            WorkstationMap.put(Workstation.getName(), Workstation);
        }
    }

    private static void populateEachWorkstationesWithItsTracability(Collection<Tracability> tracabilitys, Map<String, Workstation> WorkstationMap) {
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {

            Tracability tracability = it.next();
            if (WorkstationMap.get(tracability.getWorkstationID()) != null) {
                WorkstationMap.get(tracability.getWorkstationID()).addTracability(tracability);
            }
        }
    }

    /**
     * @return the tracabilitys
     */
    public Collection<Tracability> getTracabilitys() {
        return Collections.unmodifiableCollection(tracabilitys);
    }

    public Collection<Workstation> extract() {
        Collection<Workstation> workstations = new ArrayList<Workstation>();

        //      Create a HashSet which allows no duplicates
        Map<String, Tracability> WorkstationTracabilityMap = new HashMap<String, Tracability>();

        Map<String, Workstation> WorkstationMap = new HashMap<String, Workstation>();


        createWorkstationTracabilityRelation(tracabilitys, WorkstationTracabilityMap);

        //We are not interrested in an event about a non-existing Workstation
        WorkstationTracabilityMap.remove(Constants.DEFAULT_VALUE_WHEN_EMPTY_ROW);

        createUniqueWorkstationesFromTracability(WorkstationTracabilityMap, workstations, WorkstationMap);
        populateEachWorkstationesWithItsTracability(tracabilitys, WorkstationMap);

        return workstations;
    }
}
