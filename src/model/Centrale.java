package model;

public class Centrale<T extends EntiteReservable<Formulaire>, F extends Formulaire> {
	T[] entites;
	int nbEntites = 0;
	
	public Centrale(T[] entites) {
		this.entites = entites;
	}
	
	public void ajouterEntite(T entite) {
		entites[nbEntites++] = entite;
	}
	
	public int[] donnerPossibilites(F formulaire) {
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
	
	public Reservation reserver(int numeroEntite, F formulaire) {
		T entite = entites[numeroEntite-1];
		formulaire.setIdentificationEntite(entite.getNumero());
		System.out.println("Entt num " + entite.getNumero());
		return entite.reserver(formulaire);
	}
}
