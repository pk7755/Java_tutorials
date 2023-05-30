import java.util.*;
public class Program11 {
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
               if (a == b && b == c){
                    System.out.println("This is the sides of an equilateral Triangle.");
               }
               else if ( a == b || b == c || c == a ){
                    System.out.println("This is the sides of an isosceles traingle.");
               }
               else{
                    System.out.println("This is the sides of a scalene Triangle.");
               }
          }else {
               System.out.println("This is invalid sides of traingle.");
          }
     }
     
}

