#include "StdAfx.h"
#include "Marcheur.h"
#include "conio.h"
#include "stdio.h"
#include "stdlib.h"
#include "dos.h"

Marcheur::Marcheur(void)
{
}

Marcheur::~Marcheur(void)
{
}
int loadFile(char* nomFichier)
{
   FILE* fichier = NULL;
   char chaine[80] = "";
   fichier = fopen(nomFichier, "r");
    if (fichier != NULL)
    {
        while (fgets(chaine, 80, fichier) != NULL) // On lit le fichier tant qu'on ne reçoit pas d'erreur (NULL)
        {
            printf("%s", chaine); // On affiche la chaîne qu'on vient de lire
	    // rajouter structure des donnees
        }
 
        fclose(fichier);
	return 1;
    }
    return NULL;
}
