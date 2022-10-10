
public class Primeur extends Article
{
	private double stockPrim;

	public Primeur(String ref, String nom, String nomFournisseur, double prixAchat, double prixVente,double stockPrim) 
	{
		super(ref, nom, nomFournisseur, prixAchat, prixVente);
		this.stockPrim = stockPrim;
	}
	
	public void remplirStockAe (double qte)
	{
		stockPrim += qte;
		System.out.println("Le nouveau stock de ce article est :"+stockPrim);
		System.out.println("les depenses dues aux articles ajoutés : "+(prixAchat * qte));
	}

	public void vendreAe (double qtev)
	{
		if(qtev > stockPrim)
		{
			System.out.println("Desole y'a pas de stock");
		}
		else
		{
		stockPrim -= qtev;
		System.out.println("Le nouveau stock de ce article est :"+stockPrim);
		System.out.println("les depenses dues aux articles ajoutés : "+(prixVente * qtev));
		}
	}
	
	private boolean equalsA(Primeur p)
	{
		return nom == p.nom && nomFournisseur == p.nomFournisseur && prixAchat == p.prixAchat && prixVente == p.prixVente && stockPrim == p.stockPrim;
	}

	public void  equalsAe(Primeur p1, Primeur p2 )
	{
		if(p1.equalsA(p2))
			System.out.println("les deux objets sont identiques !!!!!");
		else
			System.out.println("les deux objets ne sont pas identiques !!!!!");
	}

	@Override
	public String toString() {
		return  super.toString()+"\nstockPrim=" + stockPrim ;
	}
	
	
	
	

}
