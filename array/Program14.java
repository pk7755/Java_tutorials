package array;

import java.util.Scanner;

public class Program14 {
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
		System.out.println("\n=========== Output ========== ");
		for(int i=0;i<ar.length;i++) {
			System.out.println("The value of ar ["+i+"] : "+ar[i]);
		}
	
	}
	static int findlength(int ar[]) {
		int count=0;
		for(int i : ar) {
			count++;
		}
	return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int x = sc.nextInt();
		
		int r[]=createArray(x);
		displayArray(r);
		System.out.println("\n=============================");
		System.out.println("The length of the array is : "+findlength(r));
	
	}

}
