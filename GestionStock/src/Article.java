
public class Article 
{
   protected String ref;
   protected String nom;
   protected String nomFournisseur;
   protected double prixAchat;
   protected double prixVente;
   
public Article(String ref, String nom, String nomFournisseur, double prixAchat, double prixVente)
{
	this.ref = ref;
	this.nom = nom;
	this.nomFournisseur = nomFournisseur;
	this.prixAchat = prixAchat;
	this.prixVente = prixVente;
}
   
public double calculerRendement()
{
	return (prixVente - prixAchat)/prixVente;
}

@Override
public String toString() 
{
return "ref = " + ref + "\nnom = " + nom + "\nnom du Fournisseur = " + nomFournisseur + "\nprix d'achat = " + prixAchat
			+ "\nprix de vente = " + prixVente ;
}


   
}
