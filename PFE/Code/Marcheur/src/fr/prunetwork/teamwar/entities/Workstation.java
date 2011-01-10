/*
 *  Copyright (C) 2010 Team-W@R (team-war@prunetwork.fr)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation\t either version 3 of the License\t or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful\t
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not\t see <http://www.gnu.org/licenses/>.
 */
package fr.prunetwork.teamwar.entities;

import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class Workstation {

    private double fiabilityRandomLaw = Math.random();
    private double disturbanceOfWorkStation = Constants.DISTURBANCE_WORSTATION_PER_EVENT;
    private String name;
    private Collection<Tracability> tracabilitys = new ArrayList<Tracability>();
    private double fiabilityQualityTask;

    public Workstation(String name) {
        this.name = name;
    }

    /**
     * @return the disturbanceOfWorkStation
     */
    public double getDisturbanceOfWorkStation() {
        return disturbanceOfWorkStation;
    }

    /**
     * @param disturbanceOfWorkStation the disturbanceOfWorkStation to set
     */
    public void setDisturbanceOfWorkStation(double disturbanceOfWorkStation) {
        this.disturbanceOfWorkStation = disturbanceOfWorkStation;
    }

    public void addTracability(Tracability tracability) {
        getTracabilitys().add(tracability);
    }

    /**
     * @return the tracabilitys
     */
    public Collection<Tracability> getTracabilitys() {
        return Collections.unmodifiableCollection(tracabilitys);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append("\t");
        sb.append("tracabilitys count: ");
        sb.append(getTracabilitys().size());
        return sb.toString();
    }

//    public double getFiabilityRandomLaw(int computeWithCountTracability) {
//        double fiability = 1;
//
//        if (computeWithCountTracability > tracabilitys.size()) {
//            computeWithCountTracability = tracabilitys.size();
//        }
//
//        return fiability;
//    }
    public double getFiabilityRandomLaw() {
        while (Double.compare(fiabilityRandomLaw, 0.0) == 0) {
            fiabilityRandomLaw = Math.random();
        }
        return fiabilityRandomLaw;

    }

    /**
     * Fonction which calculate the fiability thanks to the number of events 
     * since the last quality task
     * @param currentDate
     * @return
     */
    public double getFiabilityQualityTask(MyDate currentDate) {

        Date lastQualityTask = new Date(0);
        fiabilityQualityTask = getNumberOfEventSinceLastQT(currentDate) *
                Constants.DISTURBANCE_WORSTATION_PER_EVENT;
        return fiabilityQualityTask;
    }

    private Double getNumberOfEventSinceLastQT(MyDate currentDate) {
        Date lastQualityTask;
        Double numberOfEvents = new Double(0);
        for (Iterator<Tracability> it = getTracabilitys().iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                if (tracability.getEvent().equals(Constants.QUALITYTASK)) {
                    lastQualityTask = tracability.getDate();
                    numberOfEvents = new Double(0);
                }
                numberOfEvents++;
            }
        }
        return numberOfEvents;
    }
}
