package methods;

import java.util.Scanner;

public class FindStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Maximum range value to \nfind the Strong Number : ");
		int x = sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			StrongNum(i);
		}
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
			System.out.println("Strong Number is :"+a);
		}
	}
	

}
