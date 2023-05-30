package array;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float ar[]= new float[4];
		ar[1]= 34.5f;
		ar[3]=34;
		
		System.out.println("==================== OUTPUT ==================");
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.println("The value of ar ["+i+"] : "+ar[i]);	
			
		}
		
	sc.close();
	}
}
