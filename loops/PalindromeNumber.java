package loops;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int rev = 0;
		int a = n;
		while(n>0) {
			int rem = n%10;
			rev = (rev*10) + rem;
			n=n/10;	
		}
		if (a==rev) 
			System.out.println(a+" is palindrome number.");
		else 
			System.out.println(a+" isn't palindrome number.");	
	}
}
 