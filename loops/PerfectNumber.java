package loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		int sum = 0;
		
		while (i <= n/2) {
			if (n%i==0 ) {
				sum+=i;
			}
			i++;
		}
		if (n==sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
			
		}
	}
}
