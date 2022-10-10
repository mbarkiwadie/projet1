package revision;

import java.util.Scanner;

public class DoubleDimension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tab [][]= new int [3][3];
		for(int i = 0; i < 3 ; i++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				System.out.println("taper");
				tab[i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < 3 ; i++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				System.out.print(tab[i][j]+" ");
				
				
				
			}
			System.out.println();
		}

	}

}
