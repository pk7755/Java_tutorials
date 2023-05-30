package array;

import java.util.Scanner;

public class Program13 {
	static int[] createArray(int size) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[size];
		System.out.println("Enter the Array elements");
		for(int i=0;i<ar.length;i++) {
			System.out.print("Enter the value of ar ["+i+"] : ");
			ar[i]=sc.nextInt();
		}
		sc.close();
		return ar;
	}
	static void displayArray(int ar[]) {
		System.out.println("========== Output ========= ");
		for(int i=0;i<ar.length;i++) {
			System.out.println("The value of ar ["+i+"] : "+ar[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length=sc.nextInt();
		System.out.println("=================================");
		int r[]=createArray(length);
		displayArray(r);
		sc.close();	
	}
}
