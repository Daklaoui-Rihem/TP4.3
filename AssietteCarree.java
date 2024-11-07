package Collection;
public class AssietteCarree extends Assiette{
	private double cote;
	
	public AssietteCarree(int annee,double cote)
	{
		super(annee);
		this.cote=cote;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public String toString() {
		return "AssietteCarree [cote=" + cote + ", annee=" + annee + "]";
	}
	
	public double calculsurface()
	{
		return cote*cote;
	}
	public double calculervaleur()
	{
		AsietteRonde as=new AsietteRonde(annee,0);
		return (as.calculervaleur()*2);
	}
	
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((AssietteCarree)o).cote==this.cote)
			{
				return true;
			}
		}
		return false;
	}
}
