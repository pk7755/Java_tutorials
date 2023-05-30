package array;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum =0;
		float ar[]= new float[10];
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.print("Enter the value of ar ["+i+"] : ");	
			ar[i]=sc.nextFloat();		
		}

		System.out.println("\n============== OUTPUT ============\n");
		for(int i=0;i<ar.length;i++) {     // Print the array values
				sum += ar[i];	
		}
		System.out.println("Sum of the all element of ar[]  : "+sum);
		
	sc.close();
	}
}
