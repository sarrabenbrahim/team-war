#pragma once

#include "String.h"
#include "Tracabilite.h"

class Produit
{
private:
	// Le nom du produit
	char *name;
	// Le numéro de la téchnologie
	int technologie;
	// La mémoir de la machine
	Tracabilite *tab;
	// La taille de la mémoir
	int nbr;

public:
	Produit(void);
	Produit(char *name, int technologie);
	~Produit(void);
	int addTracabilite(Tracabilite trace);
	int setName(char *name);
	char* getName();
	int getNbr();
	int setNumTechnologie(int technologie);
	int getNumTechnologie();
	Tracabilite *getTab();
};
