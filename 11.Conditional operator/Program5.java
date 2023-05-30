import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	float a = sc.nextFloat();
	sc.close();
	String b = (a%5==0 &&  a%11==0)?"This no is divisible by 5 & 11" : "This no is not divisible by 5 & 11";
	System.out.println("The greatest number is : "+d);
	
	
	
       
    }
}
