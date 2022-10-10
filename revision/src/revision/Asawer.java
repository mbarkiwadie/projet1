package revision;
import java.util.Scanner;
public class Asawer
{ 
	// remplir un tableau
	public static void remplirTableau(int []tab)
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrez les "+ tab.length + " éléments du tableau :");
		for(int i=0;i<tab.length;i++)
		{
			System.out.print("Élément a l'indice "+ i +" --> ");
			tab[i]=sc.nextInt();
		}
   	}
	// modification du tableau
	public static void modifierTableau(int [] tab) 
	{   int n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrez l'indice de l'élément a modifier : ");
		n = sc.nextInt();
		if((n < 0)||(n >= tab.length))
		{
			System.out.println("Erreur!");
		}
		else
		{
			System.out.print("Entrez sa valeur : ");
			tab[n]=sc.nextInt();
			System.out.print("Aprés la modification, le tableau = ");
			for(int i = 0; i < tab.length; i++)
			{
				System.out.print(tab[i]+ " " );
			}
		}
	}
	public static void main(String[] args)
	{
		final int TAILLE_TAB=10;
		
		int tab[]=new int[TAILLE_TAB];
		remplirTableau(tab);
		modifierTableau(tab);		
	}
}
