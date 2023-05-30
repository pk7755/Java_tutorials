package loops;

import java.util.Scanner;

public class FindEactEvenDigitFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		
		while(n>0) {
			int fact=1;
			int rem = n %10;
			int temp = rem;
		if(rem%2==0) {
		while (rem>0){
			fact = fact * rem;
			rem--;	
		}
		System.out.println(temp+"!= "+fact);
		}
		n=n/10;	
		}

	}

}
