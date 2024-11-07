package Collection;

import java.time.LocalDate;

public class Cuiellere extends Utensile{
	private double longueur;
	
	public Cuiellere(int annee,double longueur)
	{
		super(annee);
		this.longueur=longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return "Cuiellere [longueur=" + longueur + "]";
	}
	
	public double calculervaleur()
	{
		if(LocalDate.now().getYear()-annee>=30)
		{
			return (LocalDate.now().getYear()-annee)*0.5;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((Cuiellere)o).longueur==this.longueur)
			{
				return true;
			}
		}
		return false;
	}
}
