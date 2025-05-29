# jav-new-lab-ex-1

A.	Objectif pédagogique :
•	Comprendre comment utiliser une référence à un constructeur avec plusieurs paramètres (3 paramètres).
•	Créer et utiliser une interface fonctionnelle personnalisée (TriFunction).
•	Appliquer les concepts dans un contexte orienté objet réaliste (banque).

B.	Contexte :
Vous travaillez sur l’application bancaire M2iBank. Vous devez développer une fonctionnalité permettant de créer des comptes clients à partir de données saisies. Chaque compte client est représenté par la classe CompteClient.

C.	Étapes à suivre :
1.	Créer la classe CompteClient avec les attributs suivants :
•	String nomClient
•	TypeCompte (enum) typeCompte (EPARGNE, COURANT)
•	double soldeInitial
Inclure :
•	Un constructeur avec ces trois paramètres.
•	Une méthode toString() pour afficher les informations du compte.

2.	Créer l’interface fonctionnelle TriFunction<T, U, V, R> avec une méthode :

3.	Dans la méthode main, utiliser une référence au constructeur CompteClient::new pour instancier un compte via TriFunction.

4.	Afficher les informations du compte créé.

5.	Code final :
•	CompteClient.java
•	TypeCompte.java
•	TriFunction.java
•	Main.java

