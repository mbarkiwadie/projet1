import java.util.Scanner;

public class Article 
{
   private String reference;
   private String nom;
   private double prixHT;
   private int quantiteEnStock;
   final double TAXE = 1.149775;
public Article(String reference, String nom, double prixHT, int quantiteEnStock) 
{
	
	this.reference = reference;
	this.nom = nom;
	this.prixHT = prixHT;
	this.quantiteEnStock = quantiteEnStock;
}
public String getReference()
{
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) 
{
	this.nom = nom;
}
public double getPrixHT() 
{
	return prixHT;
}

public void setPrixHT(double prixHT) 
{
	this.prixHT = prixHT;
}

public int getQuantiteEnStock() {
	return quantiteEnStock;
}

public void setQuantiteEnStock(int quantiteEnStock) {
	this.quantiteEnStock = quantiteEnStock;
}
   
   public int approvisionner(int nb)
   {
	   quantiteEnStock +=nb;
	   return quantiteEnStock;
   }
   
   public void vendre(int nb)
   {
	   if (nb <= quantiteEnStock)
	   {
		   System.out.println("vente reussite ");
		   System.out.println("quantite rstante : "+(quantiteEnStock - nb));
	   }
	   else
	   {
		   System.out.println("vente non- reussite");
	   }       
   }
   
   public void prixTTC()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("taper le nombre d'article a acheter :");
	   int qc = sc.nextInt();
	   double somme = qc* prixHT*TAXE;
	   System.out.println("le prix TTC = "+somme);
	   
   }
   
   public void afficher()
   {
	   System.out.println("refrence : "+this.reference);
	   System.out.println("nom : "+this.nom);
	   System.out.println("prixHT : "+this.prixHT);
	   System.out.println("quantite en stock : "+this.quantiteEnStock);
	   }
}
