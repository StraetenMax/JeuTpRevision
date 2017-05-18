package application;

import tPcnam.Personnage;
import tPcnam.PersonnageJoueur;
import tPcnam.PersonnageJoueurGuerrier;
import tPcnam.PersonnageJoueurMedecin;

public class Main {

	public static void main(String[] args) {
		//instancier les classes
		Personnage P1 = new Personnage("Humain",180,75);
		PersonnageJoueur PJ1 = new PersonnageJoueur("Nain",100,90,"Pierre");
		PersonnageJoueurGuerrier PJG1 = new PersonnageJoueurGuerrier("Orc",200,180,"Alain",40, 100,true);
		PersonnageJoueurGuerrier PJG2 = new PersonnageJoueurGuerrier("Elfe",190, 90,"Jean", 25, 100,true);		
		PersonnageJoueurMedecin PJM1 = new  PersonnageJoueurMedecin("Humain", 175 , 65,"Pierre", 20);
		PersonnageJoueurMedecin PJM2 = new PersonnageJoueurMedecin("Elfe", 185, 80,"Jacques", 26);
	
	System.out.println(P1.description());
	System.out.println(PJ1.description());
	System.out.println(PJG1.description());
	
	System.out.println(PJG1.estMoinsFortQue(PJG2));
	System.out.println(PJM1.plusGrandQue(PJM2));
	
	}
}