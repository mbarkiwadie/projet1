package revision;

import java.util.Scanner;

/*
 * Compter et afficher les N premiers nombres Fibonacci.
 */
public class Fibo {

	public static void main(String[] args) {

		char rep;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("donner un nombre : ");
			int N = sc.nextInt();
			// afficher les N premiers nombre Fibonacci
			for (int i = 1; i <= N; i++)// commencer de n=1
				System.out.println("f(" + i + ") : " + fib(i));
			do {
				System.out.print("Voulez-vous recommencer [o/n] ? ");
				rep = sc.next().charAt(0);
			} while ((rep != 'o') && (rep != 'n'));

		} while (rep == 'o');
	}

// Methode pour la suite finnobacci
	private static int fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}
}