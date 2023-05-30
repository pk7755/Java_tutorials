package methods;

import java.util.Scanner;

public class AdditionOfNumbers {
	public static double Add(double x, double y) {
		return x+y;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double c = Add(a,b);
		sc.close();
		System.out.println("..................................");
		System.out.println("The sum is : "+c);
		System.out.println("..................................");
		if (c%2==0)
			System.out.println("Sum is Even.");
		else
			System.out.println("Sum is odd");
	} 
}
