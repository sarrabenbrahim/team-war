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

#include <string.h>
#include "Tracability.h"

class WorkStation {
private:
    // Le nom de la machine
    char *name;
    // La mémoire de la machine
    Tracability *tracabilityArray;
    // La taille de la mémoire
    int tracabilityArraySize;
public:
    WorkStation(void);
    WorkStation(char *name);
    ~WorkStation(void);
    int setWorkStation(WorkStation &machine);
    int addTracability(Tracability trace);
    int setName(char *name);
    char* getName();
    int getTracabilityArraySize();
    Tracability *getTracabilityArray();
};
