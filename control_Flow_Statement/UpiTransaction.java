package control_Flow_Statement;

import java.util.Scanner;

public class UpiTransaction {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance = 4000;
		int upipin = 1010;
		System.out.print("Enter the amount :");
		int amount = sc.nextInt();
		if (amount>0) {
			System.out.print("Enter the upi pin : ");
			int userpin = sc.nextInt();
			if (userpin==upipin) {
				if (amount<=balance) {
				System.out.println("Transaction is successful "+amount);
				System.out.println("Remaining balance "+(balance-amount));
				}
				else {
				System.out.println("Insufficient Balance!!!");
				}
			}else {
			System.out.println("Wrong pin");
			System.out.println("Please Enter carefully");
			}
		
		}else {
		System.out.println("Amount should be atleast 1 rupee.");
		}
	sc.close();
	}
}
