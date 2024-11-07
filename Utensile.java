package Collection;

abstract public class Utensile {
	protected int annee;

	public Utensile(int annee)
	{
		this.annee=annee;
	}
	
	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Utensile [annee=" + annee + "]";
	}
	
	abstract double calculervaleur();
	
	public boolean equals(Object o)
	{
		if(o!=null && o.getClass()!=this.getClass())
		{
			return false;
		}
		if(((Utensile)o).annee==this.annee)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

