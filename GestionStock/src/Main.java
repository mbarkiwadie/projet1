
public class Main {

	public static void main(String[] args) 
	{
		ArticleElectromenager am1 = new ArticleElectromenager("12345", "TV", "LG", 300, 375, 1000);
		ArticleElectromenager am2 = new ArticleElectromenager("12346", "Cuisinere", "LG", 301, 400, 1200);
		System.out.println("******************************************");
		System.out.println(am1.toString());
		System.out.println("******************************************");
		System.out.println(am2.toString());
		System.out.println("******************************************");
		am1.equalsAe(am1, am2);
		System.out.println("******************************************");
		am1.calculerRendement();
		am1.remplirStockAe(200);
		am1.vendreAe(3);
		System.out.println("le rendement de cet article : "+am1.calculerRendement());
		System.out.println("******************************************");
		Primeur p1 = new Primeur("1200", "Radio", "aple", 150, 180, 200);
		Primeur p2 = new Primeur("1200", "PC", "SAMSUNG", 140, 190, 300);
		System.out.println(p1.toString());
		System.out.println("******************************************");
		System.out.println(p2.toString());
		System.out.println();
		System.out.println("******************************************");
		p1.equalsAe(p1, p2);
		System.out.println("******************************************");
		p1.vendreAe(2.5);
		System.out.println("******************************************");
		p2.remplirStockAe(12.5);
		
	}

}
