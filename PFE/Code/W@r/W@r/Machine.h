#pragma once

#include "String.h"
#include "Tracabilite.h"

class Machine
{
private:
	// Le nom de la machine
	char *name;
	// La mémoir de la machine
	Tracabilite *tab;
	// La taille de la mémoir
	int nbr;
public:
	Machine(void);
	Machine(char *name);
	~Machine(void);
	int setMachine(Machine &machine);
	int addTracabilite(Tracabilite trace);
	int setName(char *name);
	char* getName();
	int getNbr();
	Tracabilite *getTab();
};
