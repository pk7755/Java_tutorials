package control_Flow_Statement;
import java.util.*;
public class CheckDivisibilityBy5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		if (n%5==0 && n%11==0) {
			System.out.println(n+" is divisible by both numbers 5 & 11. ");
		}else {
			System.out.println(n+" is not divisible by both numbers 5 & 11. ");
		}
		

	}

}
