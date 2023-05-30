package loops;

import java.util.Scanner;

public class FindPerfectNumber5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the maximum range :");
		int max=sc.nextInt();
		sc.close();
		for(int j=1;j<=max;j++) {
		int n=j;
		int a=n;
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(a%i==0) {
				sum+=i;
			}	
		}
		if(sum==n) {
			System.out.println("Perfect Number is :"+n);
		}
		
		}
	}

}
