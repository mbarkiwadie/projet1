package revision;
/*un programme de calcul de la suite de Fibonacci en Java. Ce programme Demande à l'utilisateur de saisir 
* le nombre de termes de la suite à calculer. Calculer la suite de Fibonacci avec deux méthodes :
* Méthode classique (en utilisant une boucle)et la Méthode récursive (sans boucle)et enfin Afficher la suite
*  de Fibonacci avec chacune des deux méthodes.
*C'est un code elaboré par wadie et assawer a la date du 28/08/2022
*/
import java.util.Scanner;
public class FibonacciRectifie
{
    // Methode welcome c'est une methode qui va retourner un en-tete de titre
	public static void welcome()
	{
		System.out.println("     *****************************************************************");
	    System.out.println("     **  Programmeur : wadie && asawer                              **");
	    System.out.println("     **  Date :        28 Aout 2022                                 **");
	    System.out.println("     **  Fichier :     FibonacciRectifie.java	    	            **");
	    System.out.println("     **  un programme qui affiche les N premiers termes             **");
	    System.out.println("     **           d'une suite de fibonacci                          **");
	    System.out.println("     *****************************************************************");
	} 
	// Methode recursive pour calculer les termmes de la suite de fibonacci
	public static int FibonacciRecursive(int n)
    {
        if (n <= 1)
           return n;
        else
           return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
    }
	 // Méthode recursive
	public static void suiteFibonacciRecursive (int n)
	{ 
		System.out.println("=======================================================================");
	    System.out.println("||                                                                   ||");
	    System.out.println("||*********              Methode Recursive                  *********||");
	    System.out.println("||                                                                   ||");
	    System.out.println("=======================================================================");
		System.out.println("les "+ (n + 1) + " premiers termes de la suite de fibonacci sont : ");
		long tempsT1 = System. nanoTime();
		for (int i = 0; i <= n; i++)
			System.out.println("f(" + i + ") : " + FibonacciRecursive(i));
		long tempsT2 = System. nanoTime();
		System.out.println("Durée : " + (tempsT2 - tempsT1) + " nanosecondes ");
	}
	// Methode itérative
	static void FibonacciIterative(int N)
	{
		System.out.println("=======================================================================");
		System.out.println("||                                                                   ||");
		System.out.println("||*********              Methode Itérative                  *********||");
		System.out.println("||                                                                   ||");
		System.out.println("=======================================================================");
	    System.out.println("les "+ (N + 1) + " premiers termes de la suite de fibonacci sont : ");
	    int nombre1 = 0, nombre2 = 1, compteur = 0;
	    long tempsT1 = System. nanoTime();
	    // Iterer jusqu'a ce que le compteur atteint N
	    while (compteur <= N)
	    {   // ecrire le nombre
	         System.out.println("f("+ compteur + ") : " +nombre1);	  
	        // échange
	         int nombre3 = nombre2 + nombre1;
	         nombre1 = nombre2;
	         nombre2 = nombre3;
	         compteur++;
	    }
	    long tempsT2 = System. nanoTime();
		System.out.println("Durée : " + (tempsT2 - tempsT1) + " nanosecondes ");
	}		
	   /* Méthode qui demande l'utilisateur d'inserer un entier et qui va tester si
	    *  la valeur introduite est un entier ou non
	    */ 
	public static int demanderNombre()
    {
		Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de termes que vous voulez calculer pour la suite de fibonacci : ");
        // une boucle qui verifie que la valeur entée est un entier et qui retourne un message d'erreur
	    while (!sc.hasNextInt()) 
		 { 
		    System.out.println("entrée erronée !!! veuillez taper un entier");
		    sc.next(); 
		 }
	    
	   return sc.nextInt();
   }
	/*
	 * la methode demande a l'utilisateur de taper un entier et elle verifie valeur entree
	 * puis elle retourne le resultat et a la fin elle demande a l'utilisateur de recommencer ou nn   
	 */
	public static void fibonacci()
	{
		Scanner sc = new Scanner(System.in);
		char reponse;
		do {		      
		       int n = demanderNombre();		     
		       FibonacciIterative(n);
		       suiteFibonacciRecursive(n);
			   do {
				  System.out.print("Voulez-vous recommencer [o/n] ? ");
				  reponse = sc.next().charAt(0);
			      } while ((reponse != 'o') && (reponse != 'n'));

		   } while (reponse == 'o');

		sc.close();
	}

	// la classe main 
	public static void main(String[] args) 
	{
		welcome();
		fibonacci(); 		  
	}
}

