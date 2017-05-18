# JeuTpRevision

Nous allons développer des classes pour générer les personnages nécessaire au développement d’un jeu vidéo. 
L'objectif est d'écrire les classes définies ci-dessous comme vue lors des cours.

1. Créer un package nommé TPCnam

2. Créer la classe Personnage qui aura
- comme propriétés
race de type String (qui contient Humain, nain, elfe....)
taille de type int
poids de type int
- comme méthodes :
marcher (fonction qui affichera dans la console ("Personnage marche")
dormir (fonction qui affichera dans la console ("Personnage dors")
description (fonction qui affichera dans la console ("Personnage de race xxxxxx qui mesure zzz cm et pèse zzz kg" ou xxxxxx est la race, yyy la taille et zzz le poids).


3. Créer la classe PersonnageJoueur héritant de la classe Personnage qui aura en plus :
- comme propriété
Nom de type String

- comme méthodes :
marcher qui redéfinie celle de la classe mère : (fonction qui affichera dans la console ("Personnage joueur marche")
description qui reprends la description héritée et ajoute en plus " qui se nomme aaaa" ou aaaa est le nom.

4. Créer la classe PersonnageJoueurGuerrier héritant de la classe PersonnageJoueur qui aura en plus :
- comme propriétés :
Force de type int
niveauEnergie de type int (niveau d’energie pour pouvoir sa battre)
fatigué de type booléen qui dépends de la variable niveauEnergie (créer un mutateur qui l'alimente selon la règle (si niveau = 0 alors fatigué = true sinon fatiguer = false)
- comme méthode :
estMoinsFortQue : méthode qui a un objet de type PersonnageJoueurGuerrier en entrée et qui renvoi un booléen à True si l'objet appelant à une force < force de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " dont la force est de ddd" ou ddd est la force.


5. Créer la classe PersonnageJoueurMedecin héritant de la classe PersonnageJoueur qui aura en plus :
- comme propriété :
NbMedicaments de type int
- comme méthodes :
plusGrandQue : méthode qui a un objet de type PersonnageJoueurMedecin en entrée et qui renvoi un booléen à True si l'objet appelant à une taille > taille de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " qui a *** médicaments" ou *** est nbMedicaments.

6. Créer une classe main qui va :

Instancier la classe Personnage en P1 avec une race "Humain", une hauteur de 180 et un poids de 75

Instancier la classe PersonnageJoueur en PJ1 avec une race "Nain", une taille de 100, un poids de 90, une force de 30 et un niveau d’energie de 100
Instancier la classe PersonnageJoueurGuerrier en PJG1 avec une race "Orc"", une taille de 200, un poids de 180, une force de 40 et un niveau d’energie de 100
Instancier la classe PersonnageJoueurGuerrier en PJG2 avec une race "Elfe"", une taille de 190, un poids de 90, une force de 25 et un niveau d’energie de 100

Instancier la classe PersonnageJoueurMedecin en PJM1 avec une race "Humain"", une taille de 175, un poids de 65, un nombre de médicaments de 20
Instancier la classe PersonnageJoueurMedecin en PJM2 avec une race "Elfe"", une taille de 185, un poids de 80, un nombre de médicaments de 26

Appeler la méthode description de P1
Appeler la méthode description de PJ1
Appeler la méthode description de PJG1


Appeler la méthode estMoinsFortQue de PJG1 pour le comparer à PJG2
Appeler la méthode plusGrandQue de PJM1 pour le comparer à PJM2 
