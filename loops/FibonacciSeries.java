package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number of fibonacci series  :");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd Number of fibonacci series :");
		int b = sc.nextInt();
		System.out.print("Enter how many term you want in fibonacci series : ");
		int n = sc.nextInt();
		sc.close();
		int i = a+b;
		while (i<=n) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			i++;
		}

	}

}
