import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner votre nom");
	    String nom = sc.nextLine().toUpperCase();
		System.out.println("Donner votre prenom");
	    String prenom = sc.nextLine();
	    String prenom1 = prenom.toUpperCase().substring(0, 1);
	    
	    String prenom2 = prenom1.concat(prenom.substring(1));
	    
	    
	  System.out.println(nom+" "+prenom2);
		

	}

}
