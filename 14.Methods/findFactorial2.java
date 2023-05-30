import java.util.*;

public class findFactorial2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int a = sc.nextInt();
          sc.close();
          while(a>0) {
               int rem = a % 10;
               findFactorial(rem);
               a = a/10;        
          }

     }

     public static void findFactorial(int n) {
          int fact = 1;
          int b = n;
          for(int i=1; i<=n;i++){
               fact = fact * i;
          }
          System.out.println(b + "! = " + fact);
     }
}