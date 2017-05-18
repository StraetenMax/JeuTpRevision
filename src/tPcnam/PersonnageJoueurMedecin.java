package tPcnam;

public class PersonnageJoueurMedecin extends PersonnageJoueur{
	//propriétés
	private int nbMedicaments;
	
	//constructeurs vide et initialisé
	public PersonnageJoueurMedecin(){
		super();
		nbMedicaments =0;
	}
	public PersonnageJoueurMedecin(String race, int taille, int poids, String nom,int nbMedicaments){
		super(race, taille, poids, nom);
		this.nbMedicaments= nbMedicaments;
	}
	
	//accesseur et mutateur
	public int getNbMedicaments(){
		return nbMedicaments;
	}
	
	//méthodes
	public boolean plusGrandQue(PersonnageJoueurMedecin btn){
		boolean mdf;
		if(btn.getTaille()<this.getTaille()){
			mdf = true;
		}else{
			mdf = false;
		}
		return mdf;
	}
	public String description(){
		String str = super.description()+" qui a "+this.getNbMedicaments()+" médicaments";
		return str;
	}
}
