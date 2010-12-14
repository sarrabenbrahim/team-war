struct date{
	int year;
	int month;
	int day;
	int hour;
	int minutes;
	int seconde;
}
struct tracabilite{
  	int NbrElement;
	date NomMachine;

}
struct Produit {
	char NomProduit;

	struct tracabilite;
/* en considérant que la structure AutreStructure est définie */
};