package java_program;

import java.util.Scanner;

public class TrianglePattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int r=sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<r-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}
