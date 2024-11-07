package Collection;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utensile[] us = new Utensile[5];
		us[0] = new AsietteRonde(1926, 8.4);
		us[1] = new Cuiellere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuiellere(1917, 8.8);
		us[4] = new AsietteRonde(1837, 5.4);
		Cuiellere u=new Cuiellere(1985,5.6);
		AsietteRonde ar = new AsietteRonde(1837, 5.4);
		calculer(us);
		affichercollection(us);
		affichersurface(us);
		surfacetotal(us);
		valeurtotal(us);
		uequal(us,u);
		uequal(us,ar);
	}
	static void calculer(Utensile us[])
	{
		int n=0;
		for(int i=0;i<us.length;i++)
		{
			if(us[i] instanceof Cuiellere)
			{
				n++;
			}
		}
		System.out.println("Il y a "+n+" cuilleres");
	}
	
	static void affichercollection(Utensile us[])
	{
		for(int i=0;i<us.length;i++)
		{
			System.out.println(us[i]);
		}
	}
	static void affichersurface(Utensile us[])
	{
		for(int i=0;i<us.length;i++)
		{
			if(us[i] instanceof Assiette)
			{
				System.out.println(((Assiette) us[i]).calculsurface());
			}
		}
	}
	static void surfacetotal(Utensile us[])
	{
		double s=0;
		for(int i=0;i<us.length;i++)
		{
			if(us[i] instanceof Assiette)
			{
				s+=((Assiette) us[i]).calculsurface();
			}
		}
		System.out.println("La surface totale:"+s);
	}
	
	static void valeurtotal(Utensile us[])
	{
		double s=0;
		for(int i=0;i<us.length;i++)
		{
			s+=us[i].calculervaleur();
		}
		System.out.println("La valeur totale est: "+s);
	}
	
	static void uequal(Utensile us[], Object u)
	{
		int i=0;
		boolean test=false;
		while(i<us.length && test==false)
		{
			if(us[i].equals(u))
			{
				System.out.println("L ustensile existe");
				test=true;
			}
			else
			{
				i++;
			}
		}
		if(test==false)
		{
			System.out.println("Cet Utensile n'existe pas");
		}
	}
}
