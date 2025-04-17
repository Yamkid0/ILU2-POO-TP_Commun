package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {
	private Centrale centrale;
	
	public Restaurant() {
		EntiteReservable<Formulaire>[] entites = new EntiteReservable[100];
		centrale = new Centrale<>(entites);
	}
	
	public void ajouterTable(int nbChaise) {
		System.out.println("Ajout table " + (centrale.nbEntites+1));
		Table table = new Table(centrale.nbEntites+1, nbChaise);
		centrale.ajouterEntite(table);
	}

	@Override
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}

	@Override
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
	}

}
