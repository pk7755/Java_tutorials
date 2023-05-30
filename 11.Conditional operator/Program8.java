import java.util.Scanner;

class Program8{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character : ");

	char x = sc.next().charAt(0);
	sc.close();
	
	String b = ( x >='0'  && x <= '9')? "this character is number" : " this character is not number";
	System.out.println(b);

	
       
    }
}
