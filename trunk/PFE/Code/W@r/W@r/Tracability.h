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
#include "stdafx.h"
#include "Date.h"

class Tracability {
private:
    //	{ Propriété qui indique le numéro de la tâche }
    int numTask;
    //	{ Propriété indique la date de la tâche }
    Date date;
    //	{ Propriété qui permet de préciser le type de la tâche }
    char typeTask;
public:
    Tracability(void);
    ~Tracability(void);
    Tracability(int numTask, Date date, char typeTask);
    void setNumTask(int numTask);
    int getNumTask();
    void setDate(Date date);
    Date getDate();
    void setTypeTask(char typeTask);
    char getTypeTask();
};
