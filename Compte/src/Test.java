
public class Test {

	public static void main(String[] args) 
	{

		 Compte cmp = new Compte(12345689, "wadie mbarki", 2000);
	     System.out.println(cmp.toString());
	  
	     System.out.println("*******************************");
	     cmp.debiter(200);
	     System.out.println(cmp.toString());
	     System.out.println("*******************************");
	     cmp.crediter(300);
	     System.out.println(cmp.toString());
	    
	}

}
