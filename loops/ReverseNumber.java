package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int rev = 0;
		int a = n;
		while(n>0) {
			int rem = n%10;
			rev = (rev*10) + rem;
			n=n/10;
			
		}
		System.out.println("The reverse of "+a+" is : "+rev);
		

	}

}
