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
package fr.prunetwork.teamwar.storage.reader;

import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.entities.Tracability;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

/**
 *
 * @author jpierre03+teamwar@prunetwork.fr
 * @author garciaf
 */
public class ExtractDataFromFile {

    public static Collection<Tracability> createTracabilityCollection(String fichier) {
        Collection<Tracability> tracabilitys = new ArrayList<Tracability>();

        //lecture du fichier texte
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;

            // remove the first line
            br.readLine();

            while ((ligne = br.readLine()) != null) {
                ligne = formatString(ligne);

                StringTokenizer stringTokenizer = new StringTokenizer(ligne, " , ");
                if (stringTokenizer.countTokens() == Constants.FIELD_QUANTITY_IN_FILE_ROW) {

                    Tracability tracability = instanciateTracabilityFromTokenizer(stringTokenizer);
                    tracabilitys.add(tracability);
                } else {
                    System.err.println("erreur");
                }
            }
            br.close();
        } catch (Exception e) {
        }
        return tracabilitys;
    }

    private static Tracability instanciateTracabilityFromTokenizer(StringTokenizer stringTokenizer) throws Exception {
        String taskID = stringTokenizer.nextToken();
        String date = stringTokenizer.nextToken();
        String batch = stringTokenizer.nextToken();
        String operation = stringTokenizer.nextToken();
        String quantity = stringTokenizer.nextToken();
        String event = stringTokenizer.nextToken();
        String technology = stringTokenizer.nextToken();
        String workstationID = stringTokenizer.nextToken();
        Tracability tracability = new Tracability(taskID, date, batch, operation, quantity, event, technology, workstationID);
        return tracability;
    }

    private static String formatString(String ligne) {
        //Attention : Magic Code
        //To handle the line with empty field
        ligne = ligne.replace("\"\"", "\"" + Constants.DEFAULT_VALUE_WHEN_EMPTY_ROW + "\"");
        //Format input string
        ligne = ligne.replace('_', ' ');
        ligne = ligne.replace('"', ' ');
        ligne = ligne.replace("_", "");
        return ligne;
    }
}
