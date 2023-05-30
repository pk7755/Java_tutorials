package control_Flow_Statement;
import java.util.*;

public class validTraingle {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three dimentions of the triangle.");
	System.out.print("Enter the 1st dimention : ");
	int a = sc.nextInt();
	System.out.print("Enter the 2nd dimention : ");
	int b = sc.nextInt();
	System.out.print("Enter the 3rd dimention : ");
	int c = sc.nextInt();
	sc.close();
	if (a+b>c && b+c>a && c+a>b) {
		System.out.println("Valid Traingle.");
	}else {
		System.out.println("Not Valid Traingle.");
	}
	
	}
}
