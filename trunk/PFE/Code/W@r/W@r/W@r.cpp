// W@r.cpp�: d�finit le point d'entr�e pour l'application console.
//

#include "stdafx.h"
#include "Date.h"

int _tmain(int argc, _TCHAR* argv[])
{
	printf("Salut tout le monde");
	Date date("20100925063019");
	date.toString();
	return 0;
}

