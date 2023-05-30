package array;

import java.util.Scanner;

public class InsertOneArrayElementIntoExistingArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[]= {1,2,3,5,6};
		int newar[]=new int[ar.length+1];
		System.out.print("Enter the possition where you \nto insert an element : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of element whice you \nto insert an element : ");
		int x = sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<newar.length;i++) {
			if(i< a)
				newar[i]=ar[i];
			else if(i== a)
				newar[i]= x;
			else
				newar[i]=ar[i-1];
				
		}
		System.out.println("\n\n********** AR[] **********");
		Program14.displayArray(ar);
		System.out.println("\n\n********** NEWAR[] **********");
		Program14.displayArray(newar);
	}

}
