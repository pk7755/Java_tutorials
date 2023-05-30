package java_program;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number of fibonacci series :");
		int n1=sc.nextInt();
		System.out.print("Enter the second number of fibonacci series :");
		int n2=sc.nextInt();
		System.out.println("Enter the length of the series");
		int a=sc.nextInt();
		int n3=0;
		System.out.print(n1+" "+n2+" ");
		while(a>2) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			a--;
			System.out.print(n3+" ");
		}
		
	}
}
