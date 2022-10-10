package tableauArray;

public class Adherent 
{
	private String nom;
	private String prenom;
	private int anneeAd;
	private int code;
	public Adherent(String nom, String prenom, int anneeAd, int code)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.anneeAd = anneeAd;
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	public int getAnneeAd() 
	{
		return anneeAd;
	}
	public void setAnneeAd(int anneeAd)
	{
		this.anneeAd = anneeAd;
	}
	public int getCode()
	{
		return code;
	}
	
	
	public void afficherAdherent()
	{
		System.out.println("Nom              : "+nom);
		System.out.println("Prenom           : "+prenom);
		System.out.println("Année d'adhesion : "+anneeAd);
		System.out.println("code             : "+code);
		System.out.println("*********************************");
		
	}
	
	
	
	
    
}
