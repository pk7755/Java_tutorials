package control_Flow_Statement;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int n = sc.nextInt();
		sc.close();
		if (n%100==0) {
			if (n%400==0) {
				System.out.println("This is the Century leap year");
			}
			else {
				System.out.println("Not leap year.");
			}
		} else {
			if (n%4==0) {
				System.out.println("This is the leap year.");
			}
			else {
				System.out.println("Not leap year.");
			}
		}

	}

}
