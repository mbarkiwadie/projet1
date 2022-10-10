package revision;

import java.util.Scanner;

public class Racoursi 
{ 
	// remplir un tableau
	public static void remplirTableau(int tab[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<tab.length;i++)
		{
			System.out.println("Entrez l'entier a la position "+ i);
			tab[i]=sc.nextInt();
		}
	}
	// on cherche la valeur maximale ainsi que son rang
	public static int maxTab(int tab[])
	{
		int max = tab[0];
		int rangMax = 0;
		for(int i=0;i<tab.length;i++)
		{
			if(tab[i] > max)
			{
				max = tab[i];
				rangMax = i;
			}
		}
		
		return rangMax;
	}
	// on cherche la valeur mainimale ainsi que son rang
		public static int minTab(int tab[])
		{
			int min = tab[0];
			int rangMin = 0;
			for(int i=0;i<tab.length;i++)
			{
				if(tab[i] < min)
				{
					min = tab[i];
					rangMin = i;
				}
			}
			
			return rangMin;
		}

	public static void main(String[] args) 
	{
		final int TAILLE_TAB=8;
		int tab[]=new int[TAILLE_TAB];
		remplirTableau(tab);
	    
	    System.out.println("la distance entre la position de la valeur minimale et maximale est  "+(Math.abs((maxTab(tab) - minTab(tab)))));		
	}

}
