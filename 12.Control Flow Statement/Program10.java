import java.util.*;

public class Program10 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first angle of traingle.");
          int a = sc.nextInt();
          System.out.println("Enter the second angle of traingle.");
          int b = sc.nextInt();
          System.out.println("Enter the third angle of traingle.");
          int c = sc.nextInt();
          sc.close();

          if (a + b + c == 180) {
               System.out.println("This is valid angles of traingle.");
          } else {
               System.out.println("This is invalid angles of traingle.");
          }
     }

}
