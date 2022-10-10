package revision;

import java.util.Scanner;

public class Apreciation 
{ 
	public static void apprecier(int n)
	{
		Scanner sc = new Scanner(System.in);
		while((n < 0)||(n > 30)) 
		{
			System.out.println("Entrez un nombre de bonnes réponses >=0 et <=30 :");
			n = sc.nextInt();
		}
		if((n>= 0)&&(n <= 10))
		{
			System.out.println("Faible");
		}
		else if((n>= 11)&&(n <= 20))
		      {
			      System.out.println("Passable");
		      }
		      else
		      {
		    	  System.out.println("Bien"); 
		      }
	    }

	public static void main(String[] args)
	{
		int nombre = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre de bonnes réponses >=0 et <=30 :");
		nombre = sc.nextInt();
		apprecier(nombre);
	}

}
