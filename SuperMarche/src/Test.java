
public class Test {

	public static void main(String[] args) 
	{
		Article article = new Article("123456789", "boisson", 2.5, 100);
		article.approvisionner(12);
		System.out.println(article.getQuantiteEnStock());
		article.vendre(100);
		article.prixTTC();
		article.afficher();

	}

}
