package polymorphisme;

public class Main {

	public static void main(String[] args) 
	{
		Employé tab []= new Employé [4];
		tab[0]= new Ouvrier(120, "Roy", "Sebastirn", "2004-04-02", 6);
		tab[1] = new Cadre(125, "Meunier", "Jean", "1985-03-02", 1);
		tab[2] = new Ouvrier(150, "Stewart", "Celine", "2002-04-02", 6);
		tab[3] = new Cadre(145, "Marcite", "Patrice", "1990-03-02", 4);
			
		
		for(int i =0; i< tab.length ; i++)
		{
		  System.out.println(tab[i].toString());
		  System.out.println();
		}
		
		double max = tab[0].getSalaire();
		int rang = 0;
		for(int i =0; i< tab.length ; i++)
		{
		  if(tab[i].getSalaire() > max)
		  {
			  max = tab[i].getSalaire();
		      rang = i;
		  }
		}
		
	//	System.out.println("le plus haut salaire est : "+ max + " gagné par "+ pro2 + " "+ pro1);
		
		
		double min = tab[0].getSalaire();
		 
		for(int i =0; i< tab.length ; i++)
		{
		  if(tab[i].getSalaire() < min)
		  {
			  min = tab[i].getSalaire();
			  rang = i;
		  }
		}
		
		System.out.println("le plus bas salaire est : "+ min + " gagné par "+ tab[rang].getPrenom() + " "+ tab[rang].getNom() );
        
	}

}
