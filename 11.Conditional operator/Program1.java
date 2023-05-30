import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Two number : ");
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	sc.close();
	float d = (a>b)?a:b;
	float e = (a<b)?a:b;
	System.out.println("The greatest number is : "+d);
	System.out.println("The smallest number is : "+e);
	
	
       
    }
}
