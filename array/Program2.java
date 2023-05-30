package array;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar[]= new int[10];
		ar[0] =30;
		ar[3]=20;
		ar[2]=sc.nextInt();
		sc.close();
		
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.println(ar[i]);	
			
		}
		
	
	}
}
