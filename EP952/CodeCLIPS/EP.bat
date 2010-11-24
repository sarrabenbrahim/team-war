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
(slot entreprise (type STRING))
)


(deftemplate AnalyseOffre
(slot reference 	)
(slot domaine 		)
(slot salaire		)
(slot typeContrat	)
(slot duree		)
(slot distance		)
(slot etat		)
(slot satisfactionTotal	(type FLOAT) (default 0.0))

(slot satisfactionDomaine	(type FLOAT) (default 0.0))

(slot satisfactionSalaire	(type FLOAT) (default 0.0))

(slot satisfactionTypeContrat	(type FLOAT) (default 0.0))

(slot satisfactionDistance	(type FLOAT) (default 0.0))

(slot satisfactionDuree	(type FLOAT) (default 0.0))

(slot satisfactionMotCle (type FLOAT) (default 0.0))

)

(deftemplate CoefCriteres
(slot coefTotal	(type FLOAT) (default 1.0))
(slot coefDomaine	(type FLOAT) (default 1.0))
(slot coefSalaire	(type FLOAT) (default 1.0))
(slot coefTypeContrat	(type FLOAT) (default 1.0))
(slot coefDistance	(type FLOAT) (default 1.0))
(slot coefDuree	(type FLOAT) (default 1.0))
)
 
;base de faits
(assert (CoefCriteres ))

;Offre N°1s
(assert (OffreEmploie
(reference "R0001")
(domaine "Informatique")
(nomOffre 	"Stagiaire web (H/F)")
(description	"Publier les mises à jour ");: informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne"
(salaire 740.0)
(typeContrat "Stage")
(duree 8)
(distance 800)
(etat "accepte")
(entreprise "ENTR1")
)
)

;Offre N°2
(assert (OffreEmploie
(reference "R0002" )
(domaine "Industriel" )
(nomOffre 	"Chaine logistique" )
(description	"Publier les mises à jour ");: informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne" 
(salaire 1000.0 )
(typeContrat "CDD" )
(duree 12 )
(distance 100 )
(etat "accepte" )
(entreprise "ENTR2")
)
)

;Offre N°3
(assert (OffreEmploie
(reference "R0003")
(domaine "Informatique")
(nomOffre 	"Dev J2EE")
(description	"Publier les mises à jour ");: informations sur les prochains programmes de la chaîne (création de visuels), mise à jour des rubriques génériques du site, vérification du bon fonctionnement des VOD mises en ligne"
(salaire 1200.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
(entreprise "ENTR3")
)
)

;Offre N°4
(assert (OffreEmploie
(reference "R0004")
(domaine "Informatique")
(nomOffre 	"CONSULTANT Technico-Fonctionnel SAP (H/F)")
(description	"Profil recherché : ");De formation BAC+5 (école d'ingénieur, universitaire) vous justifiez de 3 à 10 ans d'expérience sur des projets SAP. Vous maîtrisez un ou plusieurs des modules/sous modules fonctionnels suivants (version ECC 5.0/6.0) : - PP, PM, QM, CS, WM, MM, SD, PS, EHS... - FI, CO, FI-FM, IM, FSCM, SEM... - HR-PA, HR-PY, HR-TM... Vous maîtrisez un ou plusieurs des composants SAP Netweaver 7.0"
(salaire 1500.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
(entreprise "ENTR4")
)
)

;Offre N°5
(assert (OffreEmploie
(reference "R0005")
(domaine "Qualite")
(nomOffre 	"Technicien méthode(H/F)")
(description	"Vous devez suivre et mettre à jour ");des données et documents industriels nécessaires à la fabrication ; Vous proposez des améliorations de process, outillages, flux ; Vous prenez en charge les projets process ; Vous particpez aux chantiers d'amélioration continue ; Vous réalisez les dossiers machine pour l'usinage. Vous encadrez une équipe de 2 à 3 personnes"
(salaire 2200.0)
(typeContrat "CDI")
(distance 100)
(etat "accepte")
(entreprise "ENTR5")
)
)
;Offre N°6
(assert (OffreEmploie
(reference "R0006")
(domaine "Agroalimentaire")
(nomOffre 	"Chargé d'étude production agroalimentaire Loiret (HF)")
(description	"Optimisation des lignes de conditionnement"); de salades « traiteur » (6 lignes) Audit des lignes : analyse des dysfonctionnements des lignes de conditionnement (cadence, précision de dosage, pertes matières) Mise en place d'améliorations en collaboration avec les services Production et Maintenance Suivi des améliorations par la mise en place d'indicateurs pertinents et perfectionnement de la collecte des données de production (fabrication et problèmes techniques)"
(salaire 550.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
(entreprise "ENTR6")
)
)

;Offre N°7
(assert (OffreEmploie
(reference "R0007")
(domaine "Informatique")
(nomOffre 	"Réponsable qualité et systéme d'information")
(description	"Profil recherché : De formation BAC+5 ");(école d'ingénieur, universitaire). une bonne connaissance dans les outils de nouvel technique d'informatique et de communication (NTIC)"
(salaire 3200.0)
(typeContrat "CDD")
(distance 100)
(etat "accepte")
(entreprise "ENTR7")
)
)

;Offre N°8
(assert (OffreEmploie
(reference "R0008")
(domaine "Production")
(nomOffre 	"Un(e) Stagiaire Assistant le Chef de Produit Whisky Grant's")
(description	"Intégré(e) à la Direction Marketing, ");vous serez rattaché(e) au Chef de Produit Grant’s Vous l’assisterez dans sa mission de développement de la marque Grant’s · Gestion quotidienne de la marque : o Analyse de la performance (AC Nielsen), recommandation d’optimisation du plan marketing. o Suivi budgétaire. o Pilotage du plan promotionnel. o Pilotage du plan de développement des ventes · Lancement des plateformes d’expérience de marque (Event, RP…) en relation étroite avec le chef de produit. Ce stage propose une expérience complète du marketing sur un marché mature premier contributeur à la croissance des spiritueux. Votre autonomie, votre rigueur, votre sens de l’analyse, votre créativité et votre dynamisme sont les atouts indispensables pour mener à bien cette mission."
(salaire 600.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
(entreprise "ENTR8")
)
)

;Offre N°9
(assert (OffreEmploie
(reference "R0009")
(domaine "Industriel")
(nomOffre 	"Technico-commercial(e)")
(description	"Rattaché(e) au responsable d'agence,"); ce poste vous amène à : -Assurer le suivi d'un portefeuille de clients industriels (services techniques, production) sur votre secteur.- Prendre en charge le développement de l'activité commerciale sur ce même secteur"
(salaire 600.0)
(typeContrat "Stage")
(distance 100)
(etat "accepte")
(entreprise "ENTR9")
)
)

;*********************************************************************** BASE DE REGLES ***********************************************************

(defrule VDomaine
?f <- (OffreEmploie (domaine ?domaineO) (reference ?ref))
(domaine ?domaineD)
?g <-(go Vrai)
(test (= (str-compare ?domaineD ?domaineO) 0))
(not (exists (AnalyseOffre (reference ?ref))))
=>

(assert (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionDomaine 1.0)))

)



(defrule NVdomaine
?f <- (OffreEmploie (domaine ?domaineO) (reference ?ref) (entreprise ?entre))
(domaine ?domaineD)
?g<-(go Vrai)
(not (test (= (str-compare ?domaineD ?domaineO) 0)))
(not (exists (AnalyseOffre (reference ?ref))))
=>

(printout t "XXXXXXXXXXXXXX => L'offre " ?ref " de l'entreprise " ?entre " ne correspond pas au domaine recherche donc elle est annulee elle est dans le domaine " ?domaineO " <= XXXXXXXXXXXXXX !" crlf)
(modify ?f (etat "non valide , le domaine ne correspond pas "))
(assert (AnalyseOffre (reference ?ref) (domaine noValide) ))
)



(defrule TypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(test (= (str-compare ?typeContratD ?typeContratO) 0))

=>

(modify ?f (typeContrat Valide) (domaine DejaValide) (satisfactionTypeContrat (+ ?satf 6.0)))
)

(defrule TypeContrat2
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(test (= (str-compare "CDI" ?typeContratO) 0))
=>
(modify ?f (typeContrat Valide) (domaine DejaValide) (satisfactionTypeContrat (+ ?satf 5.0)))
)

(defrule TypeContrat3
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))
(test (= (str-compare "CDD" ?typeContratO) 0))
=>
(modify ?f (typeContrat Valide) (domaine DejaValide) (satisfactionTypeContrat (+ ?satf 4.0)))
)

(defrule TypeContrat4
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
?g<-(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))
(test (= (str-compare "Stage" ?typeContratO) 0))
=>
(modify ?f (typeContrat Valide) (domaine DejaValide) (satisfactionTypeContrat (+ ?satf 3.0)))
)

(defrule TypeContrat5
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))
(test (= (str-compare "VIE" ?typeContratO) 0))
=>
(modify ?f (typeContrat Valide) (domaine DejaValide) (satisfactionTypeContrat (+ ?satf 2.0)))
)

(defrule TypeContrat6
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf))
(OffreEmploie (reference ?ref) (typeContrat ?typeContratO) )
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))
(test (= (str-compare "Alternance" ?typeContratO) 0))
=>
(modify ?f (typeContrat Valide) (domaine DejaValide)(satisfactionTypeContrat (+ ?satf 1.0)))
)

(defrule NotTypeContrat
?f <- (AnalyseOffre (reference ?ref) (domaine Valide) (satisfactionTypeContrat ?satf)) 
?g <- (OffreEmploie (reference ?ref) (typeContrat ?typeContratO) (entreprise ?entre))
(typeContrat ?typeContratD)
(not (test (= (str-compare ?typeContratD ?typeContratO) 0)))
=>
(printout t "(XXXXXXXXXXXX = > L'offre " ?ref " de l'entreprise " ?entre " est annulee vu que le son type de contrat ne correspond du tout pas aux criteres recherches il est de type :" ?typeContratO " <= XXXXXXXXXXXXX" crlf)
(modify ?f (typeContrat noValide) (domaine DejaValide))
(modify ?g (etat "non valide , le Type de contract ne correspond pas du tout au critere recherche "))
)


(defrule Salaire
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)
(test (= ?salaireO ?salaireDMin ))
=>

(modify ?f (typeContrat DejaValide) (salaire Valide) (satisfactionSalaire (+ ?satf 1.0)))
)

(defrule Salaire5
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)
(test (> ?salaireO (* ?salaireDMin 2) ))

=>

(modify ?f (typeContrat DejaValide) (salaire Valide) (satisfactionSalaire (+ ?satf 5.0)))

) 
(defrule Salaire4
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)
(test (> ?salaireO (+ ?salaireDMin 800) ))

=>

(modify ?f (typeContrat DejaValide) (salaire Valide) (satisfactionSalaire (+ ?satf 4.0)))
) 
(defrule Salaire3
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)
(test (> ?salaireO (+ ?salaireDMin 400) ))

=>

(modify ?f (typeContrat DejaValide) (salaire Valide) (satisfactionSalaire (+ ?satf 3.0)))
) 

(defrule Salaire2
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)
(test (> ?salaireO ?salaireDMin ))

=>

(modify ?f (typeContrat DejaValide) (salaire Valide) (satisfactionSalaire (+ ?satf 2.0)))

)

(defrule NotSalaire
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat Valide) (satisfactionSalaire ?satf))
(OffreEmploie (reference ?ref) (salaire ?salaireO) )
(salaire ?salaireDMin)

(test (< ?salaireO ?salaireDMin ))
=>


(modify ?f (typeContrat DejaValide) (salaire noValide))
(printout t "XXXXXXXXXXXXXX => L'offre " ?ref " de l'entreprise " ?entre " est annulee vu que le salaire n'est pas sufisant il est de  :" ?salaireO " <= XXXXXXXXXXXX" crlf)
(modify ?g (etat "non valide , le Type de contract ne correspond pas du tout au critere recherche "))

)


(defrule Distance
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceS)
(test (< ?distanceO (/ ?distanceS 5)))

=>
(printout t "L'offre " ?ref " correspond a la distance recherchee" crlf)
(modify ?f (salaire DejaValide) (distance Valide) (satisfactionDistance (+ ?satf 5.0)))
)

(defrule Distance2
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf) )
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceS)
(test (< ?distanceO (/ (* 2 ?distanceS) 5)))

=>
(modify ?f (salaire DejaValide) (distance Valide) (satisfactionDistance (+ ?satf 4.0)))
)

(defrule Distance3
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceS)
(test (< ?distanceO (/ (* 3 ?distanceS) 5)))

=>
(modify ?f (salaire DejaValide) (distance Valide) (satisfactionDistance (+ ?satf 2.0)))
)

(defrule Distance4
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceS)
(test (< ?distanceO (/ (* 4 ?distanceS) 5)))

=>
(modify ?f (salaire DejaValide) (distance Valide) (satisfactionDistance (+ ?satf 1.0)))
)

(defrule Distance5
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf))
(OffreEmploie (reference ?ref) (distance ?distanceO) )
(distance ?distanceS)
(test (< ?distanceO (/ (* 5 ?distanceS) 5)))

=>
(modify ?f (salaire DejaValide) (distance Valide) (satisfactionDistance (+ ?satf 0.0)))
)

(defrule NotDistance
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire Valide) (satisfactionDistance ?satf))
?g <-(OffreEmploie (reference ?ref) (distance ?distanceO) (entreprise ?entre))
(distance ?distanceD)
(not (test (= ?distanceD ?distanceO)))

=>
(printout t "XXXXXXXXXX => L'offre " ?ref " correspond a la distance recherchee il est a " ?distanceO "  <= XXXXXXXXXXXXX" crlf)
(modify ?f (salaire DejaValide) (distance noValide))
(modify ?g (etat "non valide , la distance est très loin par rapport a la distance voulue recherche "))
)

(defrule CalculSatisfaction
?f <- (AnalyseOffre (reference ?ref) (domaine DejaValide) (typeContrat DejaValide) (salaire DejaValide) (distance Valide)
(satisfactionDomaine ?satfD) 
(satisfactionTypeContrat ?satfTC) 
(satisfactionSalaire ?satfS)
(satisfactionDuree ?satfDr)
(satisfactionDistance ?satfDs)
(satisfactionMotCle ?satfMC))
?g <-(OffreEmploie (reference ?ref) (entreprise ?entre))
(CoefCriteres
(coefDomaine ?coefD)
(coefSalaire ?coefS)
(coefTypeContrat ?coefTC)
(coefDistance ?coefDs)
(coefDuree	?coefDr)
)
 
 
=>


(modify ?f (satisfactionTotal 
(/
(+ (* ?satfD ?coefD)
(+ (* (/ ?satfTC 5) ?coefTC)
(+ (* (/ ?satfS 5) ?coefS)
(+ (+ (* (/ ?satfDr 3) ?coefDr) (* (/ ?satfDs 5) ?coefDs)) (* ?satfMC 6))
)
)
)  (+ ?coefD (+ ?coefTC (+ ?coefS (+ (+ ?coefDr 6) ?coefDs)))) )
)
(distance DejaValide))
)



(defrule AfficherResultatOK
(AnalyseOffre (reference ?ref)(domaine DejaValide) (typeContrat DejaValide) (salaire DejaValide) (distance DejaValide) (satisfactionTotal ?satifT)) 
(OffreEmploie (reference ?ref) (entreprise ?entre))
=>
(printout t "=============>L'offre : " ?ref " de l'entreprise : " ?entre " repond aux criteres cherches avec un Taux de <================ " (* ?satifT 100.0) "%" crlf)
)
(assert (initialiser true) )


;Demander les informations

(defrule DemanderCoefExecution

?g <-(reponse oui)

?f <- (CoefCriteres

(coefDomaine ?coefD)
(coefSalaire ?coefS)
(coefTypeContrat ?coefTC)
(coefDistance ?coefDs)
(coefDuree	?coefDr)
)
=>
(printout t "Donner un point entre 1-5 pour le criteres Domaine ? oui/non" crlf)
(bind ?rep0 (read) )
(printout t "Donner un point entre 0-5 pour le criteres Distance ? oui/non" crlf)
(bind ?rep1 (read) )
(printout t "Donner un point entre 0-5 pour le criteres Salaire ? oui/non" crlf)
(bind ?rep2 (read) )
(printout t "Donner un point entre 0-5 pour le criteres Type de Contrat ? oui/non" crlf)
(bind ?rep3 (read) )
(modify ?f (coefDomaine ?rep0) (coefSalaire ?rep2) (coefTypeContrat ?rep3) (coefDistance ?rep2))
(retract ?g)
(assert (go Vrai))
)

(defrule NotDemanderCoef
?g <-(reponse ?x&~oui)
=>
(assert (go Vrai))
(retract ?g)

)

(defrule DemanderCoef
=>

(printout t "Veuillez vous preciser le poind de chaque criteres ? oui/non" crlf)
(bind ?repcr (read) )
(assert (reponse ?repcr))
)

(defrule DemanderMotCleExecution
?g <-(reponseMot oui)
=>
(printout t "Saisez le mot cle avec lequel vous voullez chercher" crlf)
(bind ?rep100 (read) )
(assert (motCle ?rep100))
(retract ?g)
)

(defrule NotDemandeMotCle
?g <-(reponseMot ?x&~oui)
=>

(retract ?g)
)

(defrule DemanderMotCle
=>

(printout t "Veuillez vous chercher avec un mot clé  ? oui/non" crlf)
(bind ?repMot (read) )
(assert (reponseMot ?repMot))

)
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

(printout t "Veuillez Preciser le perimetre maximal que vous voulez ne pas depasser ?" crlf)
(bind ?distance (read) )
(assert (distance ?distance ))
)

(defrule DemanderSalaire
=>

(printout t "Veuillez Preciser le salaire minumun que vous voulez chercher ?" crlf)
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



