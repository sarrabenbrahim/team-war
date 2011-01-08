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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Jean-Pierre Prunaret (jpierre03+twar@prunetwork.fr)
 * @author garciaf
 */
public class Workstation {

    private double fiabilityRandomLaw = Math.random();
    private String name;
    private Collection<Tracability> tracabilitys = new ArrayList<Tracability>();

    public Workstation(String name) {
        this.name = name;
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
}
