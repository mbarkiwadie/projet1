package revision;
import java.util.Scanner;
public class Modification 
{
public static void main(String [] args)
{
	final int TAILLE=10;
	int tab []= new int[10];
	int nbValmod;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("entere    :");
	
	for(int i = 0; i < TAILLE; i++)
		tab[i]=sc.nextInt();
	
	for(int i = 0; i < TAILLE; i++)	
	{
		if(tab[i] < 10)
		{
			tab[i]=0;
			nbValmod = nbValmod+1;
		}
	}
	
	
	System.err.println("le nombre "+nbValmod);
	
	System.out.println("saye");
	
	for(int i = 0; i < TAILLE; i++)	
		System.out.println(tab[i]+"\t");
}
}
