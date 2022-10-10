
public class ArticleElectromenager extends Article
{
  private int stockElectro;

public ArticleElectromenager(String ref, String nom, String nomFournisseur, double prixAchat, double prixVente,	int stockElectro)
{
	super(ref, nom, nomFournisseur, prixAchat, prixVente);
	this.stockElectro = stockElectro;
}

public void remplirStockAe (int qte)
{
	stockElectro += qte;
	System.out.println("Le nouveau stock de ce article est :"+stockElectro);
	System.out.println("les depenses dues aux articles ajoutés : "+(prixAchat * qte));
}

public void vendreAe (int qtev)
{
	if(qtev > stockElectro)
	{
		System.out.println("Desole y'a pas de stock");
	}
	else
	{
	stockElectro -= qtev;
	System.out.println("Le nouveau stock de ce article est :"+stockElectro);
	System.out.println("les depenses dues aux articles ajoutés : "+(prixVente * qtev));
	}
}

private boolean equalsA(ArticleElectromenager am)
{
	return nom == am.nom && nomFournisseur == am.nomFournisseur && prixAchat == am.prixAchat && prixVente == am.prixVente && stockElectro == am.stockElectro;
}

public void  equalsAe(ArticleElectromenager am1, ArticleElectromenager am2 )
{
	if(am1.equalsA(am2))
		System.out.println("les deux objets sont identiques !!!!!");
	else
		System.out.println("les deux objets ne sont pas identiques !!!!!");
}


@Override
public String toString()
{
	return  super.toString()+"\nstock d'electro=" + stockElectro ;
}
  
  
}
