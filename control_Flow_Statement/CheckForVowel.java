package control_Flow_Statement;
import java.util.*;

public class CheckForVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet character : ");
		char s = sc.next().charAt(0);
		sc.close();
		if (s=='a'||s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U') {
			System.out.println(s+" Vowel character.");
		}else {
			System.out.println(s+" Consonant character.");
		}
	}

}
