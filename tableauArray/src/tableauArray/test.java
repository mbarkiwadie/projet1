package tableauArray;

public class test 
{

	public static void main(String[] args) 
	{
		Adherent TabAdherent [] = new Adherent[3];
		
		Association as1 = new Association("esperence", 1919, 3, TabAdherent);
		
		TabAdherent[0]= new Adherent("naim", "mohamed", 1980, 1234);
		TabAdherent[1]= new Adherent("silvain", "jose", 1970, 1235);
		TabAdherent[2]= new Adherent("chris", "laval", 1986, 1236);
		
		as1.afficherAssociation();
		
		as1.verifAdherent(1235455);
		System.out.println(as1.toString());
		

	}

}
