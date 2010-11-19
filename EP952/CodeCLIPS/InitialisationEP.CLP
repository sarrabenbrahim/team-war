(assert (initialiser true) )
(defrule InitialiserEP
=>

(printout t "Veuillez Preciser le domaine dans lequel vous voulez chercher ?")
(bind ?domaine (read))
(assert (domaine ?domaine ))

(printout t "Veuillez Preciser le type de contrat que vous voulez ?")
(bind ?typeContrat (read) )
(assert (typeContrat ?typeContrat  ))

(printout t "Veuillez Preciser le perimetre dans lequel vous voulez chercher ?")
(bind ?perimetre (read) )
(assert (perimetre ?perimetre ))

(printout t "Veuillez Preciser le salaire moyen que vous voulez chercher ?")
(bind ?salaire (read) )
(assert (salaire ?salaire ))

)

(defrule duree
(and ( or (typeContrat CDD) (typeContrat Stage) (typeContrat SVI) (typeContrat VIE) )
 ?f<-(initialiser true) )
=>
(printout t "Veuillez Preciser la duree cherchee ?")
(bind ?salaire (read) )
(assert (salaire ?salaire ))
(retract ?f)
)
