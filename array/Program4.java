package array;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ar[]= new String[4];
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.print("Enter the value of ar ["+i+"] : ");	
			ar[i]=sc.nextLine();		
		}
		System.out.println("==================== OUTPUT ==================");
		for(int i=0;i<ar.length;i++) {     // Print the array values
			System.out.println("The value of ar ["+i+"] : "+ar[i]);	
			
		}
		
	sc.close();
	}
}
