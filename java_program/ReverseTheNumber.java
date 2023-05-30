package java_program;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int a=n;
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("The reverse of "+a+" is :"+rev);
	}
}
