package revision;

import java.util.Scanner;
public class AficheAppréciation {



   
    // procedure pour afficher l'appréciation
    
    public static void appréciation (int nbBonneRep )
    {



       Scanner sc=new Scanner(System.in);
        
        
        do
        {
            System.out.println("Entrez un nombre de bonnes réponses >=0 et <=30:");
            nbBonneRep=sc.nextInt();
        
        }
        while(nbBonneRep<0 || nbBonneRep>30);
        
        if(nbBonneRep<=10)
             System.out.println("Appréciation : Faible");
        else
            if(nbBonneRep<=20)
                System.out.println("Appréciation : Passable");
            else
                System.out.println("Appréciation : Bien");
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int nbBonneRep;
        
        System.out.println("Entrez un nombre de bonnes réponses >=0 et <=30:");
        nbBonneRep=sc.nextInt();
        appréciation (nbBonneRep);
        
    }



}