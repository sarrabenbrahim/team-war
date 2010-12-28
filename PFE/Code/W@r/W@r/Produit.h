#pragma once

#include "String.h"
#include "Tracabilite.h"

class Produit
{
private:
	// Le nom du produit
	char *name;
	// Le num�ro de la t�chnologie
	int technologie;
	// La m�moir de la machine
	Tracabilite *tab;
	// La taille de la m�moir
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
