package model;

public class FormulaireRestaurant extends Formulaire{
	int nbPersonne;
	int numService;
	int numTable;
	
	public FormulaireRestaurant(int jour,
			int mois, 
			int nombrePersonne,
			int numeroService) {
		super(jour,mois);
		this.nbPersonne = nombrePersonne;
		this.numService = numeroService;
	}
	
	public int getNumeroTable() {
		return numTable;
	}
	
	public void setNumeroTable(int numTable) {
		this.numTable = numTable;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getNombrePersonnes() {
		return nbPersonne;
	}
	
}
