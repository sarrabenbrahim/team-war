#include "StdAfx.h"
#include "Machine.h"
#include "String.h"
/*
	Constructeur avec paramétre il prend en paramétre le nom
	de la machine et il l'affecte à la propriéte name de la
	classe
*/
Machine::Machine(char *name)
{
	this->name = new char [strlen(name)+1];
	strcpy(this->name,name);
}
/*
  Constructeur sans paramétre l'appele à se constructeur se fait
  lors de l'instantiation de cette classe il permet d'initier les
  propriété de la classe 
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
  implicite pour récupérer la mémoir
*/
Machine::~Machine(void)
{	
	if(this->name != NULL){
		delete [] this->tab;
		this->nbr = 0;
	}
}
/*
  Ce geter permet d'affecter à la machine son nom 
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
  à la mémoir de la machine elle prend
  en paramétre un objet de type trace
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
