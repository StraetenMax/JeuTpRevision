package tPcnam;

public class PersonnageJoueur extends Personnage {
	//propriétés
	private String nom;
	
	//constructeurs vide et initialisé
	public PersonnageJoueur(){
		super();
		nom = "";
	}
	public PersonnageJoueur(String race, int taille,int poids, String nom){
		super(race, taille, poids);
		this.nom =nom;
	}
	//accesseur et mutateur
	public String getNom(){
		return nom;
	}
	public void setNom(String nom){
		this.nom= nom;
	}
	//
}
