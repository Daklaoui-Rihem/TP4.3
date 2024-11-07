package Collection;
import java.time.LocalDate;
public class AsietteRonde extends Assiette{
	private double rayon;
	
	public AsietteRonde(int annee,double rayon)
	{
		super(annee);
		this.rayon=rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "AsietteRonde [rayon=" + rayon + ", annee=" + annee + "]";
	}
	
	public double calculsurface()
	{
		return 3.14*rayon*rayon;
	}
	
	public double calculervaleur()
	{
		if(LocalDate.now().getYear()-annee>=50)
		{
			return (LocalDate.now().getYear()-annee-50)*1;
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
			if(((AsietteRonde)o).rayon==this.rayon)
			{
				return true;
			}
		}
		return false;
	}
}
