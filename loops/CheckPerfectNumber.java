package loops;

import java.util.Scanner;

public class CheckPerfectNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		int a=n;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(a%i==0) {
				sum+=i;
			}	
		}
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}

}
