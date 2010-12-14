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
	return 1;
    }
 
    return NULL;
}
#define MAXLIGNE 80
IMAGE LireFichier(char nom[], int marge)
{	float Number;
        FILE *f;
        char s[MAXLIGNE];
        int l, h, n, k;  // maxgrey
        unsigned char *ligne;
        
        /* Ouverture du fichier */
        f = fopen (nom, "rb");
        if (f == NULL) exit(0);

        /* Lecture de l'entete */
        fgets (s, MAXLIGNE, f);
        if (s[0] != 'P' || s[1] != '5') exit(0);
        /* Lecture larg haut (saut des lignes commen�ant par un '#) */
        do 
          fgets (s, MAXLIGNE, f);
        while (s[0] == '#');
        sscanf (s, "%d %d", &l, &h);
        /* Lecture maxgrey */
        do 
          fgets (s, MAXLIGNE, f);
        while (s[0] == '#');	
        // sscanf (s, "%d", &maxgrey);

        /* Allocation Image et lecture*/
        image=allouerImage (l, h, marge);
        ligne = (unsigned char *) malloc(sizeof(unsigned char)*l);
        for (n=0 ; n<h ; n++)
        { if (fread(ligne,sizeof(unsigned char)*l,1,f)!=1) break;
          for (k=0;k<l;k++)
            image->tab[n][k]= (PIXEL) ligne[k];
        }
        fclose (f);
        free(ligne);
        return image;
}

