package model;

public class FormulaireSpectacle extends Formulaire{
	int numeroZone;
	
	public FormulaireSpectacle(int jour,
			int mois, 
			int numeroZone) {
		super(jour,mois);
		this.numeroZone = numeroZone;
	}
}
