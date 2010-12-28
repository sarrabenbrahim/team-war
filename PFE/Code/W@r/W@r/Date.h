#pragma once

class Date
{
private:
	int day;
	int month;
	int year;
	int hour;
	int minutes;
	int secondes;
public:
	Date(void);
public:
	~Date(void);
	Date(char *chaine);
	int convert(char *&chaine,int nbr);
	int getYear();
	int getMonth();
	int getDay();
	int getHour();
	int getMinutes();
	int getSecondes();
	void toString();

};
