package java_program;

import java.util.Scanner;

public class PalindromeNumber {
	public static long reverse(long n) {
		long rev=0;
		while(n>0) {
			long rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		long n=sc.nextLong();
		long a=reverse(n);
		if(n==a) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
		
		
	}

}
