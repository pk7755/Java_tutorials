import java.util.Scanner;

public class Program7{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character : ");
	char x = sc.next().charAt(0);
	sc.close();
	String y =  ( x >='a'  && x <= 'z' || x >='A' && x <= 'Z')? (( x >= 'A' && x <= 'Z')? "uppercase alphabet" : "lowercase alphabet") : " this character is not alfabet";	

	System.out.println(y);
    }
}
