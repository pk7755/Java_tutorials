import java.util.*;
public class Program6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number :");
          int n = sc.nextInt();
          sc.close();
          if (n % 5 ==0  && n % 11 == 0){
               System.out.println("The entered no is divisible by 5 & 11.");
          } else {
               System.out.println(" The Entered no isn't divisible by 5 & 11.");
          }

     }
}
