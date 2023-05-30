import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character : ");

	char x = sc.next().charAt(0);
	sc.close();
	String b = ( x >='a'  && x <= 'z' || x >='A' && x <= 'Z')? "this character is alfabet" : " this character is not alfabet";
	System.out.println(b);

	
       
    }
}
