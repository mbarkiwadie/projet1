package assawer;

public class Article 
{
   private String nom;
   private double solde;
   private int quantite;
   
public Article(String nom, double solde, int quantite) 
{
	this.nom = nom;
	this.solde = solde;
	this.quantite = quantite;
}
public String getNom() 
{
	return nom;
}
public void setNom(String nom)
{
	this.nom = nom;
}
public double getSolde()
{
	return solde;
}
public void setSolde(double solde) 
{
	this.solde = solde;
}
public int getQuantite() 
{
	return quantite;
}
public void setQuantite(int quantite)
{
	this.quantite = quantite;
}

public void afficher ()
{
	System.out.println("nom :"+nom);
	System.out.println("solde :"+solde);

}
   
   
}
