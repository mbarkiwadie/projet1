package revision;

import java.util.Scanner;

public class Carre 
{
	public static void carreImpair()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int somme = 0;
		System.out.println("Veuillez entrer un nombre positif :");
		n = sc.nextInt();
		while(n < 0) 
		{
			System.out.println("Veuillez entrer un nombre positif :");
			n = sc.nextInt();
		}
		int j = 1;
		for(int i = 1; i <= n; i++)
		{
			somme += j*j;
			j+=2;
		}
		
		System.out.println("Le résultat est "+somme);
		
	}

	public static void main(String[] args) 
	{
		carreImpair();

	}

}
