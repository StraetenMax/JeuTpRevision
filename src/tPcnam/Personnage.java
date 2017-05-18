package tPcnam;

public class Personnage {
	//propriétés
	private String race;
	int taille, poids;
	
	//constructeurs vide et initialisé
	public Personnage(){
		race = "";
		taille = 0;
		poids = 0;
	}
	public Personnage(String race, int taille, int Poids){
		this.race = race;
		this.taille = taille;
		this.poids = poids;																		
	}

}
