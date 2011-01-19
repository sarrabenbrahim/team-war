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
package fr.prunetwork.teamwar.entities;

import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author GARCIA Fabien
 * @author NAIT BELKACEM Abdelali
 */
public class Batch {

    private static final double ARBITRATY_WORKSTATION_FIABILITY_VALUE = 0.5;
    private String name;
    private String technology;
    private Collection<Tracability> tracabilitys =
            new ArrayList<Tracability>();

    public Batch(String name, String technology) {
        this.name = name;
        this.technology = technology;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the technology
     */
    public String getTechnology() {
        return technology;
    }

    public void addTracability(Tracability tracability) {
        tracabilitys.add(tracability);
    }

    /**
     * @return the tracabilitys
     */
    public Collection<Tracability> getTracabilitys() {
        return Collections.unmodifiableCollection(tracabilitys);
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append("\t");
        sb.append(getTechnology());
        sb.append("\t");
        sb.append("tracabilitysCount: ");
        sb.append(getTracabilitys().size());
        return sb.toString();
    }

    public double simpleFiability() {
        double fiability = Constants.FIABILITY_DEFAULT_BATCH;
        fiability *= Math.pow(ARBITRATY_WORKSTATION_FIABILITY_VALUE,
                (double) getTracabilitys().size());
        return fiability;
    }

    public double fiabilityWithQTAndMSL(MyDate currentDate) {
        double fiability = Constants.FIABILITY_DEFAULT_BATCH;
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                if (tracability.getEvent().equalsIgnoreCase(Constants.BATCH_CONTROL)) {
                    fiability = Constants.FIABILITY_DEFAULT_BATCH;
                } else {
                    fiability *= StoreEntities.getWorkstation(
                            tracability.getWorkstationID()).
                            getFiabilityQualityTask(tracability.getDate());
                }
            }
        }
        return fiability;
    }

    public double fiabilityWithQualityTask(MyDate currentDate) {
        double fiability = Constants.FIABILITY_DEFAULT_BATCH;
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                fiability *= StoreEntities.getWorkstation(
                        tracability.getWorkstationID()).
                        getFiabilityQualityTask(tracability.getDate());
            }
        }
        return fiability;
    }

    public double fiabilityWithQTAndMSLandWorkstation(MyDate currentDate) {
        Tracability previousTracibility = null;
        double fiability = Constants.FIABILITY_DEFAULT_BATCH;

        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                if ((tracability.getEvent().equalsIgnoreCase(Constants.BATCH_CONTROL))
                        && (!(previousTracibility == null))) {
                    fiability = Constants.FIABILITY_DEFAULT_BATCH;
                    StoreEntities.getWorkstation(
                            previousTracibility.getWorkstationID()).setDateLastControle(previousTracibility.getDate());
                } else {
                    fiability *= StoreEntities.getWorkstation(
                            tracability.getWorkstationID()).
                            getFiabilityQualityTaskAndMSL(tracability.getDate());
                }
            } else {
            }
            previousTracibility = tracability;
        }
        return fiability;
    }

    public double fiabilityMSLAndMSESafe(MyDate currentDate) {
        double fiability = Constants.FIABILITY_DEFAULT_BATCH;
        for (Iterator<Tracability> it = tracabilitys.iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                if (tracability.getEvent().equalsIgnoreCase(
                        Constants.BATCH_CONTROL)) {
                    fiability = Constants.FIABILITY_DEFAULT_BATCH;
                } else {
                    fiability *= StoreEntities.getWorkstation(
                            tracability.getWorkstationID()).
                            getFiabilityMSEAndMSLSafe(tracability.getDate());
                }
            }
        }
        return fiability;
    }
}
