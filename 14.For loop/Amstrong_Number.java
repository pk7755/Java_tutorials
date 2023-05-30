import java.util.*;

public class Amstrong_Number {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          int a = n;
          int sum = 0;
          sc.close();
          while (n < 0) {
               n = n % 10;
               sum += n * n * n;
          }
          if (sum == a) {
               System.out.println("The entered number is amstrong number.");
          } else {
               System.out.println("The entered number isn't amstrong number.");

          }

     }

}