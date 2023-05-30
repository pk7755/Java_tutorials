package loops;

import java.util.Iterator;
import java.util.Scanner;

public class FindPalindromeNumber2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the max range for checking : ");
		int max = sc.nextInt();
		sc.close();
		for(int i=0;i<=max;i++) {
			int a=i;
			int rev=0;
			while(a>0) {
				int rem=a%10;
				rev=rev*10+rem;
				a/=10;
			}
			if(rev==i) {
				System.out.println("Palindrom number is :"+i);
			}
		}
		
	}
}
