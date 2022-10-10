package lab_String;

public class Lab_String {

	public static void main(String[] args) 
	{
		String tabPath[]={"C:\\Users\\aym\\Desktop\\Client","C:\\Users\\aym\\Desktop\\Confidentiel","C:\\Users\\aym\\Desktop\\ProduitA5","C:\\Users\\aym\\Desktop\\ProduitB9"};
        System.out.println("Les noms de dossiers : ");
        System.out.println("------------------------------");
        String tabNomDoss [] = new String[4];
        for(int i = 0; i< tabPath.length; i++)
        {
        	tabNomDoss[i]= tabPath[i].substring((tabPath[i].lastIndexOf("\\"))+1);
        	System.out.println(tabNomDoss[i]);
        }
       
        System.out.println("------------------------------");
	}

}
