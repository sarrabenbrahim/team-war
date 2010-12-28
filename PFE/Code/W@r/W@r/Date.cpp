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
#include "stdafx.h"
#include "Date.h"

Date::Date(void) {

}

Date::~Date(void) {

}

/*
  Cette fonction permet de convertir une chaine de caractére donnée
  en entier elle prend en paramétre la chaine source et le nombre de
  caractére et renvoie l'entier equivalent
 */
int Date::convert(char *&chaine, int nbr) {
    int entier;

    char *tmp = new char[nbr + 1];
    strncpy(tmp, chaine, nbr);
    chaine += nbr;

    sscanf(tmp, "%d", &entier);
    return entier;
}

/*

 */
Date::Date(char *chaine) {
    this->year = this->convert(chaine, 4);
    this->month = this->convert(chaine, 2);
    this->day = this->convert(chaine, 2);
    this->hour = this->convert(chaine, 2);
    this->minutes = this->convert(chaine, 2);
    this->secondes = this->convert(chaine, 2);
}

/*

 */
int Date::getYear() {
    return this->year;
}

/*

 */
int Date::getMonth() {
    return this->month;
}

/*

 */
int Date::getDay() {
    return this->day;
}

/*

 */
int Date::getHour() {
    return this->hour;
}

/*

 */
int Date::getMinutes() {
    return this->minutes;
}

/*

 */
int Date::getSecondes() {
    return this->secondes;
}

/*

 */
void Date::print() {
    printf("%d/%d/%d %d:%d:%d", this->year, this->month, this->day, this->hour, this->minutes, this->secondes);
}
