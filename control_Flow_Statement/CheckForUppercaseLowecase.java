package control_Flow_Statement;
import java.util.*;

public class CheckForUppercaseLowecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet character : ");
		char s = sc.next().charAt(0);
		sc.close();
		if (s>= 'A' && s<= 'Z' || s>= 'a' && s<= 'z') {
			System.out.print(s+" is an Alphabet character");
			if(s>= 'A' && s<= 'Z') {
				System.out.print(" and this in Uppercase.");
			}else {
				System.out.print(" and this in Lowercase.");
			}
		}else {
			System.out.println("This is not Alphabet character.");
		}
	}
}
