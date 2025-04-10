package model;

public class ReservationHotel extends Reservation {
	int nombreLitSimple;
	int nombreLitDouble;
	int numeroChambre;
	
	public ReservationHotel(int jour,int mois,int nombreLitSimple, int nombreLitDouble, int numeroChambre) {
		super(jour,mois);
		this.nombreLitDouble = nombreLitDouble;
		this.nombreLitSimple = nombreLitSimple;
		this.numeroChambre = numeroChambre;
	}
	
	public String toString() {
		return "Le " + this.jour + "/" + this.mois +" pour " + this.nombreLitDouble + " lit double et " + this.nombreLitSimple + " lit simple à la chambre n°" + this.numeroChambre; 
	}
}