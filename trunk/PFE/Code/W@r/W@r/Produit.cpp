#include "StdAfx.h"
#include "Produit.h"
#include "String.h"
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
int Produit ::addTracabilite(Tracabilite trace)
{
	Tracabilite *tmp;
	this->name = new char[strlen(name)+1];
	strcpy(this->name,name);
	if(this->tab != NULL){
		tmp = new Tracabilite[this->nbr+1];
		for(int i=0;i<this->nbr;i++){
			tmp[i] = this->tab[i];
		}
		tmp[this->nbr] = trace;
		delete []this->tab;
		this->tab = tmp;
		this->nbr++;
	}
	else{
		this->tab = new Tracabilite[this->nbr+1];
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
Tracabilite *Produit::getTab()
{
	return this->tab;
}

