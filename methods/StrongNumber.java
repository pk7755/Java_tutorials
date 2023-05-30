package methods;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int x = sc.nextInt();
		StrongNum(x);
		sc.close();

	}
	public static void StrongNum(int n) {
		int a = n;
		
		int sum = 0;
		while(n>0) {
			int fact = 1;
			int rem = n%10;
			while(rem>0) {
				fact = fact * rem;
				rem--;
			}
		sum = sum + fact;
		n/=10;
		}
		if(sum==a) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not Strong Number");
		}
	}

}
