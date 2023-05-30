package control_Flow_Statement;


import java.util.Scanner;


public class PrintEachDigitOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			n=n/10;
			
		}
		
	}

}
