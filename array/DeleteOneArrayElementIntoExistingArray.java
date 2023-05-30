package array;

import java.util.Scanner;

public class DeleteOneArrayElementIntoExistingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[]= {1,2,3,5,6};
		
		System.out.println("********** AR[] **********");
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("The value of ar ["+i+"] : "+ar[i]);
		}
		
		int newar[]=new int[ar.length-1];
		System.out.print("\n\nEnter the possition where you \nto delete an element : ");
		int a = sc.nextInt();
		
		
		sc.close();
		
		for(int i=0;i<newar.length;i++) {
			if(i< a)
				newar[i]=ar[i];
			else
				newar[i]=ar[i+1];
				
		}
		
		System.out.println("\n\n********** NEWAR[] **********");
		for(int i=0;i<newar.length;i++) {
			System.out.println("The value of ar ["+i+"] : "+ar[i]);
		}
		
	}

}
