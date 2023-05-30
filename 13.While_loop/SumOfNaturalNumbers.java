import java.util.*;

public class SumOfNaturalNumbers {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = sc.nextInt();
          sc.close();
          int i = 1;
          long sum = 0;
          while (i <= n) {
               sum = sum + i;
               i++;
          }
          System.out.println("The sum of n numbers: " + sum);

     }

}

