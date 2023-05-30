package java_program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;	
		}
		return count;
	}
	public static int power(int exp,int base) {
		int power=1;
		while(exp>0) {
			power=power*base;
			exp--;	
		}
		return power;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int a=n;
		int exp=count(a);
		int sum=0;
		while(a>0) {
			int base=a%10;
			int pow=power(exp,base);
			sum=sum+pow;	
			a/=10;
		}
		if(sum==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		 
		
		
		
		
	}

}
