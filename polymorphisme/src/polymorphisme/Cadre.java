package polymorphisme;

public class Cadre extends Employé 
{
	private int indice;

	public Cadre(int matricule, String nom, String prenom, String dateNaissance, int indice) 
	{
		super(matricule, nom, prenom, dateNaissance);
		this.indice = indice;
	}

	public double getSalaire()
	{
		if(indice == 1)
			return 3000;
		else if (indice == 2)
			return 4000;
		else if (indice== 3)
			return 5000;
		else 
			return 6000;

	}
	
	public String toString() 
	{
		return "Cadre :\n" + super.toString()+ "\nIndice = " + indice + "\nSalaire()=" + getSalaire();
	}
	
	

}
