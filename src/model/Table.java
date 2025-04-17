package model;

public class Table extends EntiteReservable<FormulaireRestaurant>{
	CalendrierAnnuel calendrierDeuxiemeService;
	int nbChaises = 0;
	
	public Table(int numero, int nbChaises) {
		super(numero);
		this.nbChaises = nbChaises;
		calendrierDeuxiemeService = new CalendrierAnnuel();
	}

	@Override
	public boolean estLibre(FormulaireRestaurant formulaire) {
		
		if(formulaire.numService==0) {
			return calendrier.estLibre(formulaire.jour, formulaire.mois);
		} else {
			return calendrierDeuxiemeService.estLibre(formulaire.jour, formulaire.mois);
		}
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		return (formulaire.nbPersonne == nbChaises || formulaire.nbPersonne+1 == nbChaises) && estLibre(formulaire);
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		System.out.println("Formulaire");
		System.out.println(formulaire.numEntiteReserve);
		System.out.println(formulaire.nbPersonne);
		if(compatible(formulaire)) {
			return new ReservationRestaurant(formulaire.jour, formulaire.mois, formulaire.numService,formulaire.numEntiteReserve);
		} else {
			return null;
		}
	}

}
