package loops;
import java.util.*;

public class FindTheDivisorOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);	
			}
			i++;
		}
		

	}

}
