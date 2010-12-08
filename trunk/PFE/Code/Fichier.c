#include <stdlib.h>
#include <stdio.h>
#define TAILLE_MAX 1000

int chargerDonne(char nomFichier)
{
   FILE* fichier = NULL;
    char chaine[TAILLE_MAX] = "";
 
    fichier = fopen(nomFichier, "r");
 
    if (fichier != NULL)
    {
        while (fgets(chaine, TAILLE_MAX, fichier) != NULL) // On lit le fichier tant qu'on ne reçoit pas d'erreur (NULL)
        {
            printf("%s", chaine); // On affiche la chaîne qu'on vient de lire
	    // rajouter structure des donnees
        }
 
        fclose(fichier);
    }
 
    return 0;
}

