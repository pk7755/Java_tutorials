package methods;
import java.math.BigInteger;
import java.util.*;
public class Factorial{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
	    int x;
          do
	    {
          int i = 1;
	    BigInteger  factorial = BigInteger.ONE;
	    int radix=10;
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          while(i<=n){
               factorial= factorial.multiply(BigInteger.valueOf(i)); 
               i++;
          }
          String factorialString = factorial.toString(radix);
          System.out.println("The factorial of  the entered no is : "+factorialString); 
	    System.out.println("Enter 1 to continue the operations.");
	    x=sc.nextInt(); 
          
	    }while(x==1);
         sc.close();
     }
     
}



