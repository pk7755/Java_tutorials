package loops;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the max range : ");
		int max = sc.nextInt();
		sc.close();
		for(int j = 1;j<=max;j++) {
			int count=0;
			for(int i=2;i<=j/2;i++) {
				if (j%i==0) {
					count++;
				}
			}
		if (count==0) {
			System.out.println("Prime Number is :"+j);
			}
		}
	}
}
