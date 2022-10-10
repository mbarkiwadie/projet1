package tableauArray;

import java.util.Arrays;

public class Association 
{
private String nom;
private int AnneeCreation;
private int nbAdherents;
private Adherent TabAdherents[] = new Adherent[nbAdherents];

public Association(String nom, int AnneeCreation, int nbAdherents, Adherent[] tabAdherents)
{
	this.nom = nom;
	this.AnneeCreation = AnneeCreation;
	this.nbAdherents = nbAdherents;
	this.TabAdherents = tabAdherents;
}

public void  afficherAssociation()
{
	System.out.println("*********************************");
	System.out.println("Nom                  : "+nom);
	System.out.println("Année de création    : "+AnneeCreation);
	System.out.println("Nombre d'adherents   : "+nbAdherents);
	System.out.println("*********************************");


System.out.println("La liste des adherents :");
System.out.println();
for(int i=0;i<TabAdherents.length;i++)
	TabAdherents[i].afficherAdherent();
}

public void verifAdherent(int val)
{
	System.out.println("on cherche un adherent dont le code est : "+val);
	 boolean trouve = false;
	  for(int i = 0 ; i < TabAdherents.length;i++)
	  {
		   if(TabAdherents[i].getCode()== val)
		   {
			   System.out.println("il existe et son nom est : "+TabAdherents[i].getPrenom()+" "+TabAdherents[i].getNom());
			   trouve = true;
			   break;
		   }
     }
	  
	  if(trouve == false)
		  System.out.println("Le code "+val+" ne convient a aucun adherent dans l'equipe ");

}

@Override
public String toString() 
{
	return "nom=" + nom +  "AnneeCreation =" + AnneeCreation +  "nbAdherents =" + nbAdherents ;
}
}
