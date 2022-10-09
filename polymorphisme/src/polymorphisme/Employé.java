package polymorphisme;

public abstract class Employé 
{
      private int matricule;
      private String nom;
      private String prenom;
      private String dateNaissance;
      
	public Employé(int matricule, String nom, String prenom, String dateNaissance)
	{
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	

	public String toString() 
	{
		return "matricule = " + matricule + "\nnom = " + nom + "\nprenom = " + prenom + "\ndateNaissance = "+ dateNaissance;
	}
     
	public abstract double getSalaire();


	public String getNom() 
	{
		return nom;
	}




	public String getPrenom() 
	{
		return prenom;
	}


	
}      
	
	
      

