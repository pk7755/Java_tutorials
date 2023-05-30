import java.util.*;

public class FindSquare {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter 1st number: ");
          int a = sc.nextInt();
          System.out.print("Enter 2nd number: ");
          int b = sc.nextInt();
          sc.close();
          int i = 1;
          long value = 1;
          while (i <= b) {
               value = value * a;
               i++;
          }
          System.out.println("The value of a^b : " + value);

     }

}
