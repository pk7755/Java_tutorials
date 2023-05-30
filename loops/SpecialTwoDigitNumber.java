package loops;

import java.util.Scanner;

public class SpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		sc.close();
		int temp = a;
		int sum = 0;
		int product = 1;
		while (a>0) {
			int r = a%10;
			sum += r;
			product *=r;
			a /=10;
		}
	  if (sum + product == temp) {
		  System.out.println("special two digit number.");
	  }
	  else {
		  System.out.println("Not Special two digit number.");
	  }

	}

}
