package model;

public abstract class EntiteReservable<T extends Formulaire> {
	CalendrierAnnuel calendrier;
	int numero;
	
	public EntiteReservable(int numero) {
		calendrier = new CalendrierAnnuel();
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract boolean estLibre(T formulaire);
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
}
