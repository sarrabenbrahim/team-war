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
package fr.prunetwork.teamwar.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jean-Pierre Prunaret (jpierre03+twar@prunetwork.fr)
 * @author garciaf
 */
public class MyDate extends Date {

    @SuppressWarnings({"deprecation"})
    public MyDate(String date) throws Exception {
        if (date.length() != 14) {
            throw new Exception();

        } else {
            this.setYear(Integer.parseInt(date.substring(0, 4)));
            this.setMonth(Integer.parseInt(date.substring(4, 6)));
            this.setDate(Integer.parseInt(date.substring(6, 8)));
            this.setHours(Integer.parseInt(date.substring(8, 10)));
            this.setMinutes(Integer.parseInt(date.substring(10, 12)));
            this.setSeconds(Integer.parseInt(date.substring(12, 14)));
            this.setYear(Integer.parseInt(date.substring(0, 4)));


        }
    }

    @Override
    public String toString() {
        /**
         * Formatteur pour que les dates s'affichent au format ISO 8601
         */
        SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS",
                Locale.getDefault());
        return dateTime.format(this);
    }

    public static void main(String args[]) {
        try {
            String date = "20100925063400";
            MyDate dateExtractor = new MyDate(date);
            System.out.println(dateExtractor);
        } catch (Exception ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
