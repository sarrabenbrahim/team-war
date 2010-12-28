#include "StdAfx.h"
#include "Date.h"
#include "String.h"

Date::Date(void)
{

}

Date::~Date(void)
{

}
/*
  Cette fonction permet de convertir une chaine de caractére donnée
  en entier elle prend en paramétre la chaine source et le nombre de
  caractére et renvoie l'entier equivalent
*/
int Date::convert(char *&chaine,int nbr)
{
	int entier;
	
	char *tmp = new char[nbr+1];
	strncpy(tmp,chaine,nbr);
	chaine += nbr;
	
	sscanf(tmp,"%d",&entier);
	return entier;

}
/*

*/
Date :: Date(char *chaine)
{
	this->year = this->convert(chaine,4);
	this->month = this->convert(chaine,2);
	this->day = this->convert(chaine,2);
	this->hour = this->convert(chaine,2);
	this->minutes = this->convert(chaine,2);
	this->secondes = this->convert(chaine,2);	
}
/*

*/
int Date :: getYear()
{
	return this->year;
}
/*

*/
int Date :: getMonth()
{
	return this->month;
}
/*

*/
int Date :: getDay()
{
	return this->day;
}
/*

*/
int Date :: getHour()
{
	return this->hour;
}
/*

*/
int Date :: getMinutes()
{
	return this->minutes;
}
/*

*/
int Date :: getSecondes()
{
	return this->secondes;
}
/*

*/
void Date:: toString()
{
	printf("%d/%d/%d %d:%d:%d",this->year,this->month,this->day,this->hour,this->minutes,this->secondes);
}
