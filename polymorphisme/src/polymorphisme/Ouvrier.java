package polymorphisme;

public class Ouvrier extends Employé
{ 
	private int anneeAnciennete;
	
	

	
	public Ouvrier(int matricule, String nom, String prenom, String dateNaissance, int anneeAnciennete) 
	{
		super(matricule, nom, prenom, dateNaissance);
		this.anneeAnciennete = anneeAnciennete;
	}

	public double getSalaire()
	{
		return 1700 + anneeAnciennete*100;
	}

	
	public String toString() 
	{
		return "Ouvrier :\n" + super.toString()+ "\nanneeAnciennete = " + anneeAnciennete + "\nSalaire()=" + getSalaire();
	}
	
	
	
	
	

}
