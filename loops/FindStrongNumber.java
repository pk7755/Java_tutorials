package loops;

import java.util.Scanner;

public class FindStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		sc.close();
		int i;
		for(i = 1;i<=a;i++) {
		int sum = 0;
		int n = i;
		while(n>0) {
			int fact = 1;
			int rem = n%10;
		while (rem>0){
			fact = fact * rem;
			rem--;
		}
		sum = sum + fact;
		n=n/10;
		}
		if (sum==i) {
			System.out.println("Strong Number is :"+i);
			}
		}
	}
}
