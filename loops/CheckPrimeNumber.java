package loops;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int i = 2;
		int count = 0;
		while(i<=n/2) {
			if (n%i==0) {
				count++;
			}
		i++;
		}
		if (count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		

	}

}
