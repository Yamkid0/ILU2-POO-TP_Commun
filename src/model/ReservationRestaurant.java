package model;

public class ReservationRestaurant extends Reservation {
	int numService;
	int numTableReservee;
	
	public ReservationRestaurant(int jour,int mois,int numService,int numTableReservee) {
		super(jour,mois);
		this.numService = numService;
		this.numTableReservee = numTableReservee;
	}
	
	public String toString() {
		String service = numService == 1 ? "premier": "deuxième";
		return "Le " + this.jour + "/" + this.mois +"\nTable " + this.numTableReservee + " pour le " + service + " service."; 
	}
}