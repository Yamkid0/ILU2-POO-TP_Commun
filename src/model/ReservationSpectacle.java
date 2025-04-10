package model;

public class ReservationSpectacle extends Reservation {
	int numZone;
	int numeroChaise;
	
	public ReservationSpectacle(int jour,int mois,int numZone, int numeroChaise) {
		super(jour,mois);
		this.numZone = numZone;
		this.numeroChaise = numeroChaise;
	}
	
	public String toString() {
		return "Le " + this.jour + "/" + this.mois +" pour la zone " + this.numZone + " chaine n° " + this.numeroChaise; 
	}
}