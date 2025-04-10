package model;

public abstract class Formulaire {
	int jour;
	int mois;
	int numEntiteReserve;
	
	public Formulaire(int jour,	int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return numEntiteReserve;
	}

	public void setIdentificationEntite(int numEntiteReserve) {
		this.numEntiteReserve = numEntiteReserve;
	}
	
	
	
	
}
