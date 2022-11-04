Il faut premiérement lancer consul :
![![screen](1.JPG)]
Démmarer le config-service la chose qui va permettre aux autres micros services de trouver leurs configuration qui est indiquée dans config-repo
![![screen](/screens/config repo.JPG)]
La gateway nous permet de redériger les requettes qui viennet du REST API vers le bon micro service
![![screen](/screens/gateway.JPG)]
Parmi les micros services que nous avons crée il y a customer service, product service, et order service.
démarrer le customer service:
![![screen](/screens/customer.JPG)]
démarrer le product service:
![![screen](/screens/inventory.JPG)]
Démmarer le order service :
![![screen](/screens/order-service.JPG)]

Si tous les services sont bien démarrés, on peut les voir dans consul :
![![screen](/screens/consul.JPG)]

Voici les résultats :
![![screen](/screens/resultat.JPG)]
![![screen](/screens/orders.JPG)]
![![screen](/screens/orders2.JPG)]
![![screen](/screens/projection.JPG)]
![![screen](/screens/projection2.JPG)]
![![screen](/screens/projection3.JPG)]
![![screen](/screens/product1.JPG)]


