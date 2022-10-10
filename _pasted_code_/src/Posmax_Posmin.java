import java.util.Scanner;
public class Posmax_Posmin
{
       //fonction +declaration variables
  public static int [] remplirtableau(int []tab)
   
  {
             
      //déclarer tableau : reserver 8 cases
          
        
          Scanner sc=new Scanner(System.in);
          
     //remplir tableau
          for(int i=0;i<tab.length;i++)
          {
            System.out.println("Taper l entier a la position " + i);
            tab[i]=sc.nextInt();
          }
     //afficher tableau
          for(int i=0;i<tab.length;i++)
          {
             System.out.println(tab[i]);
            
          }
        return tab;
       
  }
   public static int posvalmax(int tab[])
   {
     //Chercher valeur maximale et sa position
          int valmax=tab[0];
         
          int posvalmax=0;
          
            for(int i=0;i<tab.length;i++)
          {
              if(tab[i]>valmax)
              {
                    valmax=tab[i];
                    posvalmax=i;
              }
            
          }
            return posvalmax;
   }
   
   public static int posvalmin(int tab[])
   {  
   int valmin=tab[0];
   int posvalmin=0;
            
      //Chercher la position de la valeur minimale et sa position
           for (int i=0;i<tab.length;i++)
           {
               if(tab[i]<valmin)
              {
                   valmin=tab[i];
                   posvalmin=i;
              }
           }
                            
      return posvalmin;
    
  }
    //Appel a la fonction
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez la taille du tableau ");
        int n=sc.nextInt();
        
		int tab[]=new int[n];
        remplirtableau(tab);
        System.out.println("La distance entre la position de la valeur maximale et la position de la valeur minimale est " + (posvalmax(tab) - posvalmin(tab)));
    }



}