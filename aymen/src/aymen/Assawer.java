package aymen;

public class Assawer 
{
  private int age;
  private String nom;
  private double salaire;
public Assawer(int age, String nom, double salaire) 
{
	
	this.age = age;
	this.nom = nom;
	this.salaire = salaire;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getNom() {
	return nom;
}
public void setNom(String nom)
{
	this.nom = nom;
}

public String toString() 
{
	return "age=" + age + ", nom=" + nom + ", salaire=" + salaire ;
}

public void afficher()
{
	System.out.println("hello");
}

  
  
}
