import java.util.Scanner;

public class Program2{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Three number : ");
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	float c = sc.nextFloat();
	sc.close();
	float d = (a>b)?((a>c)?a:c):((b>c)?b:c);
	float e = (a<b)?((a<c)?a:c):((b<c)?b:c);
	System.out.println("The greatest number is : "+d);
	System.out.println("The smallest number is : "+e);
	
	
       
    }
}
