package tPcnam;

public class PersonnageJoueurGuerrier extends PersonnageJoueur {
		//propriétés
	private int force;
	private int niveauEnergie;
	private boolean fatigué;
	
		//constructeurs vide et initialisé
	public PersonnageJoueurGuerrier(){
		super();
		force = 0;
		niveauEnergie = 0;
		fatigué = true;
	}
	
	public PersonnageJoueurGuerrier(String race, int taille, int poids, String nom, int force, int niveauEnergie, boolean fatigué){
		super(race, taille, poids, nom);
		this.force = force;
		this.niveauEnergie = niveauEnergie;
		this.fatigué = fatigué;
		
	}
}
