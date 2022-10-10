package revision;



import java.util.Scanner;



public class table

{
	
   public static int [] remplir()
   {
	   Scanner cl = new Scanner(System.in);
	   System.out.println("Donner la longeur du tableau : ");
		 int n = cl.nextInt();	
	  int tab []= new int[n];
	
	   for(int i = 0 ; i < n ; i ++)
	   {	   
	  System.out.println("Donner l'element n "+i+ " :");
	  
	   tab[i]= cl.nextInt();
	
	    }
	   cl.close();
	   return tab;
   }
  
   public static void afficher(int tab [])
   {
	   System.out.print(" les elements du tableau sont :  ");
	   for(int i = 0 ; i < tab.length ; i ++)
		   
	   {
		  
	        System.out.print(tab [i]+ "  ");
	  
	   }
   }
	  public static void chercher (int tab [])
	  {  
		  int rang = 0;
		  boolean trouve = false;
		 
		  Scanner cl = new Scanner(System.in);
		
		  System.out.println("cle : ");
		
	     int cle = cl.nextInt();
	     System.out.println(cle);
	     
		  /* 
		  for(int i = 0; i < tab.length ; i++)
		  {   
			
			  if (tab [i] == cle)
			  {
				  trouve = true;
				  rang = i;
				  System.out.println("yes"+rang);
			  }
			  
			      
			 
		  }
		  if (trouve != true)
			  System.out.println("nooooo");
	
		  cl.close();
		  */
	  }
	

	

	public static void main(String[] args)
	{  
		
   
	
      
	  int table [] = remplir ();
	
	 
	 afficher(table);
	 System.out.println();
     chercher(table);
	
	
	 
	 
		
    }

}	 





