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
 /**
 *
 * @author Jean-Pierre Prunaret (jpierre03+twar@prunetwork.fr)
 * @author mesbahi.jaafar
 */
#pragma once

class Date {
private:
    int day;
    int month;
    int year;
    int hour;
    int minutes;
    int secondes;
public:
    Date(void);
public:
    ~Date(void);
    Date(char *chaine);
    int convert(char *&chaine, int nbr);
    int getYear();
    int getMonth();
    int getDay();
    int getHour();
    int getMinutes();
    int getSecondes();
    void print();

};
