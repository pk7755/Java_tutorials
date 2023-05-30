package control_Flow_Statement;
import java.util.*;

public class LeapYear2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int n = sc.nextInt();
		sc.close();
		if ((n%4==0)&&(n%100!=0)||(n%400==0)) {
			System.out.println("Leap Year");	
		}
		else {
			System.out.println("Not a Leap year.");
		}
		
			
		

	}

}
