package revision;

import java.util.Scanner;
public class sommecarre {



   public static int somme_carre(int n )
    {
    int s=0, j=1;
    
    for (int i=1;i<=n;i++)
    {
        s=s+(j*j);
        j=j+2;
    }
    return s;
    }    
     
    public static void main(String[] args)
{
        {
            Scanner sc = new Scanner (System.in);
            
        
        System.out.println("Veillez entrez un nombre positif : ");
        int n=sc.nextInt();
        
            System.out.println ("Le resultat " + somme_carre(n));
            }
        }
}
    
