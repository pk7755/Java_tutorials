package loops;

import java.util.Scanner;
public class printNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i<=n;i++) {
			System.out.print(" "+i);
			if (i%10==0) {
				System.out.println();
			}
		}
	}
}
