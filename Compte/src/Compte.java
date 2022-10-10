
public class Compte 
{
	int numCompte;
	String titulaire;
	double solde;

	    public Compte(int numCompte, String titulaire, double solde) 
	    {
	        this.numCompte = numCompte;
	        this.titulaire = titulaire;
	        this.solde = solde;
	    }
        
	    
	    public void afficher()
	    {
	        System.out.println("le numero de compte : "+numCompte);
	        System.out.println("le titulaire du compte  : "+titulaire);
	        System.out.println("le solde : "+solde);
	    }
	     public double crediter(double credit)
	     {
	    	  this.solde  = solde + credit;
	    	  return solde;
	     }
	      public double debiter(double debit)
	      {
	    	  this.solde  = solde - debit;
	    	  return solde;
	    	  
	      }


		public int getNumCompte() {
			return numCompte;
		}


		public void setNumCompte(int numCompte) {
			this.numCompte = numCompte;
		}


		public String getTitulaire() {
			return titulaire;
		}


		public void setTitulaire(String titulaire) {
			this.titulaire = titulaire;
		}


		public double getSolde() {
			return solde;
		}


		public void setSolde(double solde) {
			this.solde = solde;
		}
	      
	  

         
	  	
}
