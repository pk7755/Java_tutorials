package patternPrintingOfSquareAlphabets;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many lines you want :");
		int a = sc.nextInt();
		System.out.print("Enter how many star you want :");
		
		int b = sc.nextInt();
		for(int i=0;i<a;i++) //rows
		{
			for(int j = 0; j<b;j++) //columns
			{
				System.out.print(" * ");
			}
		System.out.println( );
		}
	sc.close();

	}

}
