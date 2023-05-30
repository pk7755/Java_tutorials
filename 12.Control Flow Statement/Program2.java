import java.util.*;

public class Program2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number : ");
          float a = sc.nextFloat();
          System.out.print("Enter the second number : ");
          float b = sc.nextFloat();
          System.out.print("Enter the third number : ");
          float c = sc.nextFloat();
          System.out.print("Enter the forth number : ");
          float d = sc.nextFloat();
          sc.close();

          if (a > b) {
               if (a > c) {
                    if (a > d) {
                         System.out.println("The biggest no is :" + a);
                    } else {
                         System.out.println("The biggest no is :" + d);
                    }
               } else {
                    if (c > d) {
                         System.out.println("The biggest no is :" + c);
                    } else {
                         System.out.println("The biggest no is :" + d);
                    }
               }
          } else {
               if (b > c) {
                    if (b > d) {
                         System.out.println("The biggest no is :" + b);
                    } else {
                         System.out.println("The biggest no is :" + d);
                    }
               } else {
                    if (c > d) {
                         System.out.println("The biggest no is :" + c);
                    } else {
                         System.out.println("The biggest no is :" + d);
                    }
               }
          }
     }
}
