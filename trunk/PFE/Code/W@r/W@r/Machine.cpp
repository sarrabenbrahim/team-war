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
#include "Machine.h"

/*
 * Constructeur avec paramètre il prend en paramètre le nom de la machine et 
 * il l'affecte à la propriété name de la classe.
 */
WorkStation::WorkStation(char *name) {
    this->name = new char [strlen(name) + 1];
    strcpy(this->name, name);
}

/*
  Constructeur sans paramétre l'appele à se constructeur se fait
  lors de l'instantiation de cette classe il permet d'initier les
  propriété de la classe 
 */
WorkStation::WorkStation(void) {
    this->tracabilityArray = NULL;
    this->tracabilityArraySize = 0;
    this->name = new char[2];
    strcpy(this->name, "");
}

/*
  Destructeur l'appel au destructeur se fait automatiquement
  implicite pour récupérer la mémoir
 */
WorkStation::~WorkStation(void) {
    if (this->name != NULL) {
        delete [] this->tracabilityArray;
        this->tracabilityArraySize = 0;
    }
}

/*
  Ce geter permet d'affecter à la machine son nom 
  dans le cas ou on ne l'affecte pas
 */
int WorkStation::setName(char * name) {
    this->name = new char[strlen(name) + 1];
    strcpy(this->name, name);
    return 1;
}

char * WorkStation::getName() {
    return this->name;
}

/*
  Cette fonction permet d'ajouter une trace
  à la mémoir de la machine elle prend
  en paramétre un objet de type trace
 */
int WorkStation::addTracability(Tracability trace) {
    Tracability *tmp;
    this->name = new char[strlen(name) + 1];
    strcpy(this->name, name);
    if (this->tracabilityArray != NULL) {
        tmp = new Tracability[this->tracabilityArraySize + 1];
        for (int i = 0; i<this->tracabilityArraySize; i++) {
            tmp[i] = this->tracabilityArray[i];
        }
        tmp[this->tracabilityArraySize] = trace;
        delete []this->tracabilityArray;
        this->tracabilityArray = tmp;
        this->tracabilityArraySize++;
    } else {
        this->tracabilityArray = new Tracability[this->tracabilityArraySize + 1];
        this->tracabilityArray[this->tracabilityArraySize] = trace;
        this->tracabilityArraySize++;
    }
    return 1;
}

/*
        getter qui renvoie la taille du tableau
 */
int WorkStation::getTracabilityArraySize() {
    return this->tracabilityArraySize;
}

/*
 Getter qui renvoie le tableau en entier
 */
Tracability *WorkStation::getTracabilityArray() {
    return this->tracabilityArray;
}

int WorkStation::setWorkStation(WorkStation &machine) {
    //this->tab = machine->tab;
    return 1;
}
