package array;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float ar[]= new float[4];
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.print("Enter the value of ar ["+i+"] : ");	
			ar[i]=sc.nextFloat();		
		}
		System.out.println("==================== OUTPUT ==================");
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.println("The value of ar ["+i+"] : "+ar[i]);	
			
		}
		
	sc.close();
	}
}
