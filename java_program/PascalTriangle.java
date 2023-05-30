package java_program;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many rows you want to print : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num=1;
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1); 
			}
			System.out.println();
		}
	}

}
