package revision;

import java.util.Scanner;

public class projetTest 
{
 public static int f(int n)
 {
	 
     if (n == 0)
    	 return 0;
     if(n==1)
    	 return 1;
     else
      
	 return f(n -1)+f(n+2);
 }
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner(System.in);
		int N = 0;
		System.out.println("Donner un entier : ");
		N = clavier.nextInt();
	    
		    	   for (int i = 0; i <= N ; i++)
		    	   {
		    		   System.out.println("fib("+i+") = "+f(i));
		    	   }
		       

	}

}
