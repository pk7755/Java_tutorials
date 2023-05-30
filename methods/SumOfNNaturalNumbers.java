package methods;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	public static int findSum(int n) {
		if (n>0) 
			n = n + findSum(n-1);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		int sum = findSum(n);
		System.out.println("The sum of "+n+" Natural numbers is : "+sum);
	}
}
