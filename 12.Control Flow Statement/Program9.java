import java.util.*;
public class Program9 {
     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter the first side of traingle.");
          int a = sc.nextInt();
          System.out.println("Enter the second side of traingle.");
          int b = sc.nextInt();
          System.out.println("Enter the third side of traingle.");
          int c = sc.nextInt();
          sc.close();

          if (a+b > c && b+c >a && c+a > b){
               System.out.println("This is valid sides of traingle.");
          }else {
               System.out.println("This is invalid sides of traingle.");
          }
     }
     
}
