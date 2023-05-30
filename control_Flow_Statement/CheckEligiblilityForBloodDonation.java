package control_Flow_Statement;

import java.util.Scanner;

public class CheckEligiblilityForBloodDonation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		if (age>18) {
			System.out.print("Enter the weight: ");
			int weight = sc.nextInt();
			if (weight>55) {
				System.out.println("Person is eligible for Blood donation.");
			}else {
				System.out.println("Person isn't eligible for Blood donation due to underweight."); 	
			}
		}else {
			System.out.println("Person isn't eligible for Blood donation due to underage."); 
		}
		sc.close();
	}

}
