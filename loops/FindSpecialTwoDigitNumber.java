package loops;

import java.util.Scanner;

public class FindSpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		sc.close();
		for(int i = 10;i<=a;i++) {
		int n=i;
		int temp = n;
		int sum = 0;
		int product = 1;
		while (n>0) {
			int r = n%10;
			sum += r;
			product *=r;
			n /=10;
		}
	  if (sum + product == temp) {
		  System.out.println("special two digit number :"+i);
		  
	  }
	

	}

}
}
