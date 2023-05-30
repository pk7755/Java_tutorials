package control_Flow_Statement;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;	
		}
		System.out.println(count);

	}

}
