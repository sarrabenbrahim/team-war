#pragma once
#include "Date.h"
class Tracabilite
{
private:
	//	{ Propriété qui indique le numéro de la tâche }
	int numTask;
	//	{ Propriété indique la date de la tâche }
	Date date;
	//	{ Propriété qui permet de préciser le type de la tâche }
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
