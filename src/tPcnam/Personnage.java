package tPcnam;

public class Personnage {
	//propriétés
	private String race;
	int taille; 
	int poids;
	
	//constructeurs vide et initialisé
	public Personnage(){
		race = "";
		taille = 0;
		poids = 0;
	}
	public Personnage(String race, int taille, int poids){
		this.race = race;
		this.taille = taille;
		this.poids = poids;																		
	}
	
	//accesseurs et mutateurs
	public String getRace(){
		return race;
	}
	public int getTaille(){
		return taille;
	}
	public int getPoids(){
		return poids;
	}
	public void setRace(String race){
		this.race = race;	
	}
	public void setTaille(int taille){
		this.taille = taille;
	}
	public void setPoids(int poids){
		this.poids= poids;
	}
	
	//méthodes
	public String marcher(){
		return "Personnage marche";
	}
	public String dormir(){
		String str = "Personnage dort";
		return str;
	}
	public String description(){
		String str1 ="Personnage de race "+this.getRace()+" qui mesure "+this.getTaille()+" cm et pèse "+this.getPoids()+" kg";
		return str1;
	}
}
