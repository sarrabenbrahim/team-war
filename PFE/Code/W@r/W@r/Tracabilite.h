#pragma once
#include "Date.h"
class Tracabilite
{
private:
	//	{ Propri�t� qui indique le num�ro de la t�che }
	int numTask;
	//	{ Propri�t� indique la date de la t�che }
	Date date;
	//	{ Propri�t� qui permet de pr�ciser le type de la t�che }
	char typeTask;
public:
	Tracabilite(void);
	~Tracabilite(void);
	Tracabilite(int numTask,Date date, char typeTask);
	void setNumTask(int numTask);
	int getNumTask();
	void setDate(Date date);
	Date getDate();
	void setTypeTask(char typeTask);
	char getTypeTask();
};
