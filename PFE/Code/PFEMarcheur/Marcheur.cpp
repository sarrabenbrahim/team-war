/*
 *  Copyright (C) 2010 Team-W@R (team-war@prunetwork.fr)
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 /**
 *
 * @author mesbahi.jaafar
 * @author abdelali.nait
 */
#include "Marcheur.h"
#include "stdio.h"
#include "stdlib.h"

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
        while (fgets(chaine, 80, fichier) != NULL) // On lit le fichier tant qu'on ne re�oit pas d'erreur (NULL)
        {
            printf("%s", chaine); // On affiche la cha�ne qu'on vient de lire
	    // rajouter structure des donnees
        }
 
        fclose(fichier);
	return 1;
    }
    return 0;
}
