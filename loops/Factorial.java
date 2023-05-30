package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int fact = 1;
		while (n>0){
			fact = fact * n;
			n--;
		}
		System.out.println(temp+"! = "+fact);
	}
}
