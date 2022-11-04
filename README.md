Il faut premiérement lancer consul :
![![screen](1.JPG)]
Démmarer le config-service la chose qui va permettre aux autres micros services de trouver leurs configuration qui est indiquée dans config-repo
![![screen](gconfig repo.JPG)]
La gateway nous permet de redériger les requettes qui viennet du REST API vers le bon micro service
![![screen](gateway.JPG)]
Parmi les micros services que nous avons crée il y a customer service, product service, et order service.
démarrer le customer service:
![![screen](customer.JPG)]
démarrer le product service:
![![screen](inventory.JPG)]
Démmarer le order service :
![![screen](order-service.JPG)]

Si tous les services sont bien démarrés, on peut les voir dans consul :
![![screen](consul.JPG)]

Voici les résultats :
![![screen](resultat.JPG)]
![![screen](orders.JPG)]
![![screen](orders2.JPG)]
![![screen](projection.JPG)]
![![screen](projection2.JPG)]
![![screen](projection3.JPG)]
![![screen](product1.JPG)]


