package model;

public class Centrale<T extends EntiteReservable<Formulaire>> {
	EntiteReservable[] entites;
	int nbEntites = 0;
	
	public Centrale(EntiteReservable[] entites) {
		this.entites = entites;
	}
	
	public void ajouterEntite(T entite) {
		entites[nbEntites++] = entite;
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] possibilites = new int[nbEntites];
		for(int i = 0; i < nbEntites; i++) {
			if(entites[i].compatible(formulaire)) {
				possibilites[i] = entites[i].getNumero();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public void reserver(int numeroEntite, Formulaire formulaire) {
		T entite = (T) entites[numeroEntite-1];
		return .reserver(formulaire)
	}
}
