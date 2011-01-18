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

import com.sun.corba.se.impl.orbutil.closure.Constant;
import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.utilities.MyDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 * @author NAIT BELKACEM Abdelali
 */
public class Workstation {

    private double fiabilityRandomLaw = Math.random();
    private double disturbanceOfWorkStation = Constants.DISTURBANCE_WORSTATION_PER_EVENT;
    private String name;
    private Collection<Tracability> tracabilitys = new ArrayList<Tracability>();
    private Collection<Tracability> ListOfControls= new ArrayList<Tracability>();

    private double fiabilityQualityTask = Constants.FIABILITY_DEFAULT_WORKSTATION;
    double fiabilityTQAndMSL = Constants.FIABILITY_DEFAULT_WORKSTATION;

    public Collection<Tracability> getListOfControls() {
        return ListOfControls;
    }

    public void setListOfMSL(Collection<Tracability> setOfMSL) {
        this.ListOfControls = setOfMSL;
    }
    private MyDate dateLastControle = new MyDate();

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

    public double getFiabilityRandomLaw() {
        while (Double.compare(fiabilityRandomLaw, 0.0) == 0) {
            fiabilityRandomLaw = Math.random();
        }
        return fiabilityRandomLaw;

    }

    /**
     * Fonction which calculate the fiability thanks to the number of events 
     * since the last quality task
     * The operation done is this one :
     *  fiabilityQualityTask = Math.max(fiabilityQualityTask, Constants.FIABILITY_MIN_WORSKATION);
     * @param currentDate
     * @return
     */
    public double getFiabilityQualityTask(MyDate currentDate) {

        fiabilityQualityTask = Constants.FIABILITY_DEFAULT_WORKSTATION - getNumberOfEventSinceLastQT(currentDate)
                * Constants.DISTURBANCE_WORSTATION_PER_EVENT;
        fiabilityQualityTask = fiabilityQualityTask < Constants.FIABILITY_MIN_WORSKATION ? Constants.FIABILITY_MIN_WORSKATION : fiabilityQualityTask;
        return fiabilityQualityTask;
    }

    /**
     *
     * @param currentDate
     * @return
     */
    public double getFiabilityQualityTaskAndMSL(MyDate currentDate) {

        fiabilityTQAndMSL = fiabilityTQAndMSL - getNumberOfEventSinceLastControl(currentDate) * Constants.DISTURBANCE_WORSTATION_PER_EVENT;
        fiabilityTQAndMSL = fiabilityTQAndMSL < Constants.FIABILITY_MIN_WORSKATION ? Constants.FIABILITY_MIN_WORSKATION : fiabilityTQAndMSL;

        return fiabilityTQAndMSL;
    }

    private Double getNumberOfEventSinceLastQT(MyDate currentDate) {

        Date lastQualityTask;
        Double numberOfEvents = new Double(0);

        for (Iterator<Tracability> it = getTracabilitys().iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if (tracability.getDate().before(currentDate)) {
                if (tracability.getEvent().equalsIgnoreCase(Constants.QUALITYTASK)) {
                    lastQualityTask = tracability.getDate();
                    numberOfEvents = new Double(0);
                } else {
                    numberOfEvents++;
                }
            }
        }
        return numberOfEvents;
    }
    public Double getFiabilityMSEAndMSLSafe(MyDate currentDate){
        getDateLastControle(currentDate);
        Double nbEvents=getNumberOfEventSinceLastControl(currentDate);
         fiabilityTQAndMSL = Math.max(Constants.FIABILITY_MIN_WORSKATION,Constants.FIABILITY_DEFAULT_WORKSTATION - nbEvents * Constants.DISTURBANCE_WORSTATION_PER_EVENT);
        return fiabilityTQAndMSL;
    }
        private void getDateLastControle(MyDate currentDate) {

        MyDate lastQualityTask=null;
        Double numberOfEvents = new Double(0);
        Iterator<Tracability> it=getListOfControls().iterator();

            while ((it.hasNext()) && (lastQualityTask==null)) {
                Tracability tracabilityBefor=it.next();
                if(it.hasNext()){
                    Tracability tracabilityAfter=it.next();
                    if(tracabilityBefor.getDate().before(currentDate) && tracabilityAfter.getDate().after(currentDate)){
                        lastQualityTask=tracabilityBefor.getDate();

                    }
                }else{
                    if(tracabilityBefor.getDate().before(currentDate))
                          lastQualityTask=tracabilityBefor.getDate();
                }

            }
        if(lastQualityTask!=null) dateLastControle=lastQualityTask;
    }

        /**
         * @param currentDate
         * @return
         */
    private Double getNumberOfEventSinceLastControl(MyDate currentDate) {
        Double numberOfEvents = new Double(0);
        for (Iterator<Tracability> it = getTracabilitys().iterator(); it.hasNext();) {
            Tracability tracability = it.next();
            if ((tracability.getDate().before(currentDate)) && tracability.getDate().after(dateLastControle)) {
                numberOfEvents++;
            }
        }

        return numberOfEvents;
    }

    /**
     * @param lastControleMSE the lastControleMSE to set
     */
    public void setDateLastControle(MyDate lastControleMSE) {
        this.dateLastControle = lastControleMSE;
    }

    /**
     * @return the lastControleMSE
     */
    public MyDate getDateLastControle() {
        return dateLastControle;
    }
}
