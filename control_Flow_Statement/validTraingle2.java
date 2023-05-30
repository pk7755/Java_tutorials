package control_Flow_Statement;
import java.util.*;

public class validTraingle2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three angle of the triangle.");
	System.out.print("Enter the 1st angle : ");
	int a = sc.nextInt();
	System.out.print("Enter the 2nd angle : ");
	int b = sc.nextInt();
	System.out.print("Enter the 3rd angle : ");
	int c = sc.nextInt();
	sc.close();
	if (a+b+c==180) {
		System.out.println("Valid Traingle.");
	}else {
		System.out.println("Not Valid Traingle.");
		}
	}
}
