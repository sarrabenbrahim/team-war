
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

;base de regles

(defrule VDomaine
?f <- (OffreEmploie (domaine ?domaineO) (reference ?ref) (satisfaction ?satif)
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



