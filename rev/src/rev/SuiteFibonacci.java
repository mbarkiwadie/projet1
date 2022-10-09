package rev;
public class SuiteFibonacci {
    
    public static void main(String args[])  
    {    
        int nbr1=0, nbr2=1, nbr3, i, count=10;  
        //afficher 0 et 1
        System.out.print(nbr1+" "+nbr2);   
    
        //La boucle commence par 2 car 0 et 1 sont deja affiches
        for(i=2; i<count; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;  
            System.out.print(" "+nbr3);
        }    
  
    }





}