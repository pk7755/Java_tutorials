package loops;

import java.util.Scanner;

public class CheckForStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int sum = 0;
		while(n>0) {
			int fact=1;
			int rem = n %10;
		while (rem>0){
			fact = fact * rem;
			rem--;
		}
		sum += fact;
		n=n/10;
		}
		if (sum==temp) {
			System.out.println(temp+" is Strong Number");
		}else {
			System.out.println("The each digit Factorial sum of the number is not equal to that same number.");
			System.out.println(temp+" isn't Strong Number.");
		}
	}
}
