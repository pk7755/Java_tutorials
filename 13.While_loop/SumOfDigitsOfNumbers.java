import java.util.*;

public class SumOfDigitsOfNumbers {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = sc.nextInt();
          sc.close();
          
          long sum = 0;
          while (n>0) {
               int x = n%10;
               sum = sum + x;
               n = n/10;
               
          }
          System.out.println("The sum of the digits of the numbers : " + sum);

     }

}