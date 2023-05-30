package control_Flow_Statement;
import java.util.*;

public class CheckForAlphabetAndSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet character : ");
		char s = sc.next().charAt(0);
		sc.close();
		if (s>= 'A' && s<= 'Z' || s>= 'a' && s<= 'z') {
			System.out.println(s+" Alphabet character.");
		}else if(s>='0' && s<='9') {
			System.out.println(s+" Digit character.");
		}else {
			System.out.println(s+" Special character.");
		}
	}
}
