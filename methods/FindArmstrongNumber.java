package methods;

import java.util.Scanner;


public class FindArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Maximum range value to \nfind the Armstrong Number : ");
		int a = sc.nextInt();
		sc.close();
		for(int i = 1;i<=a;i++) {
			int x = i;
			int temp = x;
			int exp = FindCount(x);
			int sum = 0;
		while(x>0) {
			int rem = x%10;
			int p = findPower(rem, exp);
			sum = sum +p;
			x = x/10;	
		}
		if(sum==temp) {
			System.out.println("Armstrong Number is : "+ temp);
			}
		}	
	}
	public static int FindCount(int n) {
		int count = 0;
		while(n>0) {	
			
			count++;
			n/=10;
		}
		return count;
		
		
	}
	public static int  findPower(int base, int exp) {
		int pow = 1;
		while(exp>0) {
			pow = pow* base;
			exp--;
		}
		return pow;
		
	}

}
