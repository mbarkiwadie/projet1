package revision;

import java.util.Scanner;



public class Salaire
{
   public static int verifier()
   {
	   
	   Scanner sc = new Scanner(System.in);
	  
	  int n = 0;
  
 do
 {
	      System.out.println("Donner le nombre  : ");
	      n = sc.nextInt();
 }while((n < 0)|| (n >50) );
	 return n;
   }

	public static void main(String[] args)
	{  
	
	verifier();
	 
	 
		
    }

}	 
