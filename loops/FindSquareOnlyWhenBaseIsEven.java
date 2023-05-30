package loops;

import java.util.Scanner;

public class FindSquareOnlyWhenBaseIsEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base value : ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent value or power value : ");
		int exp = sc.nextInt();
		sc.close();
		int pow = 1;
		int a = exp;
		if (base%2==0) {
		while(exp>0 ) {
			pow = pow * base;
			exp--;
		}
		System.out.println("Base "+base+" to the power "+a+" is : "+pow);
		}
		else  {
			System.out.println("The base value is not even value.");
		}

	}

}
