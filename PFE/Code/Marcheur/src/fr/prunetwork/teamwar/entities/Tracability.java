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

import fr.prunetwork.teamwar.utilities.MyDate;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class Tracability {

    private String taskID;
    private MyDate date;
    private String batch;
    private String operation;
    private String quantity;
    private String event;
    private String technology;
    private String workstationID;

    public Tracability(String taskID,
            String date,
            String batch,
            String operation,
            String quantity,
            String event,
            String technology,
            String workstationID) throws Exception {
        this.taskID = taskID;
        this.date = new MyDate(date);
        this.batch = batch;
        this.operation = operation;
        this.quantity = quantity;
        this.event = event;
        this.technology = technology;
        this.workstationID = workstationID;
    }

    public Tracability(MyDate date) {
        this.taskID = "NULL";
        this.date = date;
        this.batch = "NULL";
        this.operation = "NULL";
        this.quantity = "0";
        this.event = "NULL";
        this.technology = "NULL";
        this.workstationID = "NULL";

    }

    /**
     * @return the taskID
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    /**
     * @return the date
     */
    public String printDate() {
        return date.toString();
    }

    public MyDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) throws Exception {
        this.date = new MyDate(date);
    }

    /**
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the event
     */
    public String getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return the technology
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * @param technology the technology to set
     */
    public void setTechnology(String technology) {
        this.technology = technology;
    }

    /**
     * @return the workstationID
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * @param workstationID the workstationID to set
     */
    public void setWorkstationID(String workstationID) {
        this.workstationID = workstationID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(taskID);
        sb.append("\t");
        sb.append(date);
        sb.append("\t");
        sb.append(batch);
        sb.append("\t");
        sb.append(operation);
        sb.append("\t");
        sb.append(quantity);
        sb.append("\t");
        sb.append(event);
        sb.append("\t");
        sb.append(technology);
        sb.append("\t");
        sb.append(workstationID);
        return sb.toString();
    }
}
