package methods;

import java.util.Scanner;

public class findFactorial {
	public static long findFact(long n) {
		if (n==0) {
			return 1;
		}else {
			if (n>0 )
				return (n*findFact(n-1));
			return n;
		}
	}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		do 
		{
			System.out.println(".........................................");
			System.out.print("Enter the number : ");
			long n = sc.nextLong();
		 
			long factorial = findFact(n);
			System.out.println(n+"! = "+factorial);
			System.out.println("=========================================");
			System.out.println("Enter 1 to continue the operations.");
			x = sc.nextInt();
		 } while(x == 1);
	System.out.println("=========================================");
	sc.close();
	}
}
