#pragma once

#include "String.h"
#include "Tracabilite.h"

class Machine
{
private:
	// Le nom de la machine
	char *name;
	// La m�moir de la machine
	Tracabilite *tab;
	// La taille de la m�moir
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
