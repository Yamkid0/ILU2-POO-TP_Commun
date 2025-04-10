package model;

public class FormulaireHotel extends Formulaire{
	int nombreLitSimple;
	int nombreLitDouble;
	
	public FormulaireHotel(int jour,
			int mois, 
			int nombreLitSimple,
			int nombreLitDouble) {
		super(jour,mois);
		this.nombreLitSimple = nombreLitSimple;
		this.nombreLitDouble = nombreLitDouble;
	}
}
