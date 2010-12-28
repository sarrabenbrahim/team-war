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
#include "Produit.h"
#include <string.h>
/*
*/
Produit::Produit(char *name, int technologie)
{
	this->name = new char [strlen(name)+1];
	strcpy(this->name,name);
	this->technologie = technologie;
}
/*
*/
Produit::Produit(void)
{
	this->tab = NULL;
	this->nbr = 0;
	this->name = new char[2];
	strcpy(this->name,"");
}
/*
*/
Produit::~Produit(void)
{	
	if(this->name != NULL){
		delete [] this->tab;
		this->nbr = 0;
	}
}
/*
*/
int Produit :: setName(char * name)
{
	this->name = new char[strlen(name)+1];
	strcpy(this->name,name);
	return 1;
}
char * Produit::getName(){
	return this->name;
}
/*

*/
int Produit :: setNumTechnologie(int technologie)
{
	this->technologie = technologie;
	return 1;
}
/*

*/
int Produit :: getNumTechnologie()
{
	return this->technologie;
}
/*
*/
int Produit ::addTracabilite(Tracability trace)
{
	Tracability *tmp;
	this->name = new char[strlen(name)+1];
	strcpy(this->name,name);
	if(this->tab != NULL){
		tmp = new Tracability[this->nbr+1];
		for(int i=0;i<this->nbr;i++){
			tmp[i] = this->tab[i];
		}
		tmp[this->nbr] = trace;
		delete []this->tab;
		this->tab = tmp;
		this->nbr++;
	}
	else{
		this->tab = new Tracability[this->nbr+1];
		this->tab[this->nbr] = trace;
		this->nbr++;
	}
	return 1;
}
/*

*/
int Produit::getNbr(){
	return this->nbr;
}
/*

*/
Tracability *Produit::getTab()
{
	return this->tab;
}

