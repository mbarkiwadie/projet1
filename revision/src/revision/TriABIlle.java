package revision;

import java.util.Arrays;
import java.util.Scanner;

public class TriABIlle 
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
		//tri a bulle
		public static void triABulles(int tab[])
		{
			int temporary = 0;
			  for (int i = 0; i < tab.length; i++) {
		            for (int j = i + 1; j < tab.length; j++) {
		                if (tab[i] > tab[j]) {
		                    temporary = tab[i];
		                    tab[i] = tab[j];
		                    tab[j] = temporary;
		                }
		            }
		        }
			for(int i=0;i<tab.length;i++)
			{
				System.out.println(tab[i]);
			}
		}
		// tri par selection
		public static void tri_selection(int[] tab)
	     {
	          for (int i = 0; i < tab.length - 1; i++)  
	          {
	               int index = i;  
	               for (int j = i + 1; j < tab.length; j++)
	               {
	                    if (tab[j] < tab[index])
	                    { 
	                        // index = j;
	                         tab[index]= tab[j];
	                    }
	               }
	               tab[i]= tab[index];
	 /*
	               int min = tab[index];
	               tab[index] = tab[i]; 
	               tab[i] = min;
	               */
	          }
	          for(int i=0;i<tab.length;i++)
				{
					System.out.println(tab[i]);
				}
	     }
		public static boolean verif()
		{
			return false;
		}
		public static int cummul (int ent1, int ent2)
		{
			int somme = 0;
			if(ent1 > ent2)
			{
				return -1;
			}
			else
			{
				for (int i = ent1; i <= ent2; i++)
				{
					somme = somme + i ;
				}
				return somme;
			}
		}
	public static void main(String[] args) 
	{
		/*final int TAILLE_TAB = 4;
		int tab[]=new int[TAILLE_TAB];
		remplirTableau(tab);
		triABulles(tab);
		System.out.println("tri selection");
		tri_selection(tab);
		*/
		//System.out.println(verif());
		Scanner sc  = new Scanner(System.in);
		System.out.println("veuillez saisir le premier entier ; ");
		int n1= sc.nextInt();
		System.out.println("veuillez saisir le second entier ; ");
		int n2= sc.nextInt();
		System.out.println("cummul("+n1+ ","+n2+") = "+cummul(n1, n2)); 

	}

}
