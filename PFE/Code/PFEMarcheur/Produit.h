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
 * @author mesbahi.jaafar
 * @author abdelali.nait
 */
#pragma once

#include <string.h>
#include "Tracability.h"

class Produit
{
private:
	// Le nom du produit
	char *name;
	// Le num�ro de la technologie
	int technologie;
	// La m�moir de la machine
	Tracability *tab;
	// La taille de la m�moire
	int nbr;

public:
	Produit(void);
	Produit(char *name, int technologie);
	~Produit(void);
	int addTracabilite(Tracability trace);
	int setName(char *name);
	char* getName();
	int getNbr();
	int setNumTechnologie(int technologie);
	int getNumTechnologie();
	Tracability *getTab();
};
