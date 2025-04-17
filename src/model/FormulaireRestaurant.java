package model;

public class FormulaireRestaurant extends Formulaire{
	int nbPersonne;
	int numService;
	
	public FormulaireRestaurant(int jour,
			int mois, 
			int nombrePersonne,
			int numeroService) {
		super(jour,mois);
		this.nbPersonne = nombrePersonne;
		this.numService = numeroService;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getNombrePersonnes() {
		return nbPersonne;
	}
	
}
