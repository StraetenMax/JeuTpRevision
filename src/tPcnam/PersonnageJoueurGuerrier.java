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
		//accesseur et mutateur
	public int getForce(){
		return force;
	}
	public void setForce(int force){
		this.force = force;	
	}
	public int getNiveauEnergie(){
		return niveauEnergie;
	}
	public void setNiveauEnergie(int niveauEnergie){
		this.niveauEnergie = niveauEnergie;
	}
	public boolean getFatigué(){
		return fatigué;
	}
	public void setFatigué(boolean fatigué){
		this.fatigué = fatigué;
	}
	//methodes
	public boolean estMoinsFortQue(PersonnageJoueurGuerrier brt){
		boolean emfq;
		if(brt.getForce()<this.getForce()){
			emfq = true;
		}else{
			emfq = false;
		}
		return emfq;
	}
	public String description(){
		String str = super.description()+" dont la force est de "+this.getForce();
		return str;
	}
}
