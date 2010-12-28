#include "StdAfx.h"
#include "Machine.h"
#include "String.h"
/*
	Constructeur avec param�tre il prend en param�tre le nom
	de la machine et il l'affecte � la propri�te name de la
	classe
*/
Machine::Machine(char *name)
{
	this->name = new char [strlen(name)+1];
	strcpy(this->name,name);
}
/*
  Constructeur sans param�tre l'appele � se constructeur se fait
  lors de l'instantiation de cette classe il permet d'initier les
  propri�t� de la classe 
*/
Machine::Machine(void)
{
	this->tab = NULL;
	this->nbr = 0;
	this->name = new char[2];
	strcpy(this->name,"");
}
/*
  Destructeur l'appel au destructeur se fait automatiquement
  implicite pour r�cup�rer la m�moir
*/
Machine::~Machine(void)
{	
	if(this->name != NULL){
		delete [] this->tab;
		this->nbr = 0;
	}
}
/*
  Ce geter permet d'affecter � la machine son nom 
  dans le cas ou on ne l'affecte pas
*/
int Machine :: setName(char * name)
{
	this->name = new char[strlen(name)+1];
	strcpy(this->name,name);
	return 1;
}
char * Machine::getName(){
	return this->name;
}
/*
  Cette fonction permet d'ajouter une trace
  � la m�moir de la machine elle prend
  en param�tre un objet de type trace
*/
int Machine ::addTracabilite(Tracabilite trace)
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
	getter qui renvoie la taille du tableau
*/
int Machine::getNbr(){
	return this->nbr;
}
/*
 Getter qui renvoie le tableau en entier
*/
Tracabilite *Machine::getTab(){
	return this->tab;
}
int Machine :: setMachine(Machine &machine){
	//this->tab = machine->tab;
	return 1;
}
