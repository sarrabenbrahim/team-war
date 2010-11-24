
(reset)
;Structure

(deftemplate OffreEmploie
(slot reference 	(type STRING))
(slot domaine 		(type STRING))
(slot nomOffre 		(type STRING))
(slot description	(type STRING))
(slot salaire		(type FLOAT))
(slot typeContrat	(type STRING))
(slot duree		(range 0 ?VARIABLE))
(slot distance		(type INTEGER))
(slot etat		(type STRING))
(slot satisfaction	(type FLOAT))
)

(deftemplate AnalyseOffre
(slot reference 	)
(slot domaine 		)
(slot salaire		)
(slot typeContrat	)
(slot duree		)
(slot distance		)
(slot etat		)
)

;base de faits


;Offre N°1
(assert (OffreEmploie
(reference "R0001")
(domaine "Informatique")
(nomOffre 	"Stagiaire web (H/F)")
(description	"Publier les mises à jour : informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne")
(salaire 740.0)
(typeContrat "Stage")
(duree 8)
(distance 800)
(etat "accepte")
)
)

;Offre N°2
(assert (OffreEmploie
(reference "R0002" )
(domaine "Industriel" )
(nomOffre 	"Chaine logistique" )
(description	"Publier les mises à jour : informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne" )
(salaire 1000.0 )
(typeContrat "CDD" )
(duree 12 )
(distance 100 )
(etat "accepte" )
)
)

;Offre N°3
(assert (OffreEmploie
(reference "R0003")
(domaine "Informatique")
(nomOffre 	"Dev J2EE")
(description	"Publier les mises à jour : informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne")
(salaire 1200.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
)
)

;Offre N°4
(assert (OffreEmploie
(reference "R0004")
(domaine "Informatique")
(nomOffre 	"CONSULTANT Technico-Fonctionnel SAP (H/F)")
(description	"Profil recherché : De formation BAC+5 (école d'ingénieur, universitaire) vous justifiez de 3 à 10 ans d'expérience sur des projets SAP. Vous maîtrisez un ou plusieurs des modules/sous modules fonctionnels suivants (version ECC 5.0/6.0) : - PP, PM, QM, CS, WM, MM, SD, PS, EHS... - FI, CO, FI-FM, IM, FSCM, SEM... - HR-PA, HR-PY, HR-TM... Vous maîtrisez un ou plusieurs des composants SAP Netweaver 7.0")
(salaire 3500.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
)
)

;Offre N°5
(assert (OffreEmploie
(reference "R0005")
(domaine "Qualite")
(nomOffre 	"Technicien méthode(H/F)")
(description	"Vous devez suivre et mettre à jour des données et documents industriels nécessaires à la fabrication ; Vous proposez des améliorations de process, outillages, flux ; Vous prenez en charge les projets process ; Vous particpez aux chantiers d'amélioration continue ; Vous réalisez les dossiers machine pour l'usinage. Vous encadrez une équipe de 2 à 3 personnes")
(salaire 2200.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
)
)

;Offre N°6
(assert (OffreEmploie
(reference "R0006")
(domaine "Agroalimentaire")
(nomOffre 	"Chargé d'étude production agroalimentaire Loiret (HF)")
(description	"Optimisation des lignes de conditionnement de salades « traiteur » (6 lignes) Audit des lignes : analyse des dysfonctionnements des lignes de conditionnement (cadence, précision de dosage, pertes matières) Mise en place d'améliorations en collaboration avec les services Production et Maintenance Suivi des améliorations par la mise en place d'indicateurs pertinents et perfectionnement de la collecte des données de production (fabrication et problèmes techniques)")
(salaire 550.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
)
)

;Offre N°7
(assert (OffreEmploie
(reference "R0007")
(domaine "Informatique")
(nomOffre 	"Réponsable qualité et systéme d'information")
(description	"Profil recherché : De formation BAC+5 (école d'ingénieur, universitaire). une bonne connaissance dans les outils de nouvel technique d'informatique et de communication (NTIC)")
(salaire 3200.0)
(typeContrat "CDD")
(distance 100)
(etat "accepte")
)
)

;Offre N°8
(assert (OffreEmploie
(reference "R0008")
(domaine "Production")
(nomOffre 	"Un(e) Stagiaire Assistant le Chef de Produit Whisky Grant's")
(description	"Intégré(e) à la Direction Marketing, vous serez rattaché(e) au Chef de Produit Grant’s Vous l’assisterez dans sa mission de développement de la marque Grant’s · Gestion quotidienne de la marque : o Analyse de la performance (AC Nielsen), recommandation d’optimisation du plan marketing. o Suivi budgétaire. o Pilotage du plan promotionnel. o Pilotage du plan de développement des ventes · Lancement des plateformes d’expérience de marque (Event, RP…) en relation étroite avec le chef de produit. Ce stage propose une expérience complète du marketing sur un marché mature premier contributeur à la croissance des spiritueux. Votre autonomie, votre rigueur, votre sens de l’analyse, votre créativité et votre dynamisme sont les atouts indispensables pour mener à bien cette mission.")
(salaire 600.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
)
)

;Offre N°9
(assert (OffreEmploie
(reference "R0009")
(domaine "Industriel")
(nomOffre 	"Technico-commercial(e)")
(description	"Rattaché(e) au responsable d'agence, ce poste vous amène à Assurer le suivi d'un portefeuille de clients industriels (services techniques, production) sur votre secteur.- Prendre en charge le développement de l'activité commerciale sur ce même secteur.")
(salaire 600.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
)
)
;base de regles

(defrule VDomaine
?f <- (OffreEmploie (domaine ?domaineO) (reference ?ref) (satisfaction ?satif))
(domaine ?domaineD)
(test (= (str-compare ?domaineD ?domaineO) 0))

=>
;(printout t "L'offre " ?ref " correspond au domaine recherche" crlf)
(assert (AnalyseOffre (reference ?ref) (domaine Valide)))
(modify ?f (satisfaction (+ ?satif 5))) 
)

(defrule NVdomaine
?f <- (OffreEmploie (domaine ?domaineO) (reference ?ref))
(domaine ?domaineD)
(not (test (= (str-compare ?domaineD ?domaineO) 0)))
(not (exists (AnalyseOffre (reference ?ref))))
=>
(printout t "L'offre " ?ref " ne correspond pas au domaine recherche" crlf)
(modify ?f (etat "non valide , le domaine ne correspond pas "))
(assert (AnalyseOffre (reference ?ref) (domaine noValide)))
)

(defrule TypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(test (= (str-compare ?typeContratD ?typeContratO) 0))

=>
(printout t "L'offre " ?ref " correspond au type de contrat recherche" crlf)

(modify ?f (typeContrat Valide) (domaine DejaValide))
)

(defrule NotTypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))

=>
(printout t "L'offre " ?ref " ne correspond pas au type de contrat recherche" crlf)

(modify ?f (typeContrat noValide) (domaine DejaValide))
)

(defrule TypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(test (= (str-compare ?typeContratD ?typeContratO) 0))

=>
(printout t "L'offre " ?ref " correspond au type de contrat recherche" crlf)

(modify ?f (typeContrat Valide) (domaine DejaValide))
)

(defrule NotTypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))

=>
(printout t "L'offre " ?ref " ne correspond pas au type de contrat recherche" crlf)

(modify ?f (typeContrat noValide) (domaine DejaValide))
)

(defrule Salaire
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireD)
(test (= ?salaireD ?salaireO ))

=>
(printout t "L'offre " ?ref " correspond au salaire recherche" crlf)

(modify ?f (typeContrat DejaValide) (salaire Valide))
)

(defrule NotSalaire
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireD)
(not( test (= ?salaireD ?salaireO)))

=>
(printout t "L'offre " ?ref " correspond au salaire recherche" crlf)

(modify ?f (typeContrat DejaValide) (salaire noValide))
)

(defrule Distance
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceD)
(test (= ?distanceD ?distanceO))

=>
(printout t "L'offre " ?ref " correspond a la distance recherchee" crlf)

(modify ?f (salaire DejaValide) (distance Valide))
)

(defrule NotDistance
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceD)
(not (test (= ?distanceD ?distanceO)))

=>
(printout t "L'offre " ?ref " correspond a la distance recherchee" crlf)

(modify ?f (salaire DejaValide) (distance noValide))
)

(assert (initialiser true) )
(defrule DemanderDomaine
=>

(printout t "Veuillez Preciser le domaine dans lequel vous voulez chercher ?" crlf)
(bind ?domaine (read))

(assert (domaine ?domaine ))

)

(defrule DemanderPreciser
=>
(printout t "Veuillez Preciser le type de contrat que vous voulez ?" crlf)
(bind ?typeContrat (read) )
(assert (typeContrat ?typeContrat  ))
)

(defrule DemanderPerimetre
=>

(printout t "Veuillez Preciser le perimetre dans lequel vous voulez chercher ?" crlf)
(bind ?distance (read) )
(assert (distance ?distance ))
)

(defrule DemanderSalaire
=>

(printout t "Veuillez Preciser le salaire moyen que vous voulez chercher ?" crlf)
(bind ?salaire (read) )
(assert (salaire ?salaire))
)

(defrule duree
(and ( or (typeContrat CDD) (typeContrat Stage) (typeContrat SVI) (typeContrat VIE) )
 ?f<-(initialiser true) )
=>
(printout t "Veuillez Preciser la duree cherchee ?" crlf)
(bind ?salaire (read) )
(assert (salaire ?salaire ))
(retract ?f)
)



