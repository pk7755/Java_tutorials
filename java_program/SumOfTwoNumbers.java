package java_program;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente the value of a :");
		int a=sc.nextInt();
		System.out.print("Ente the value of b :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The sum of a and b is : "+c);
	}
}
