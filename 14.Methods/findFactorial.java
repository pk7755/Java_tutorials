import java.util.*;

public class findFactorial{
     public static void main(String[] args){
          
          Fact();
          Fact();
          Fact();
          Fact();
          
          
          
     }
     public static void Fact() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          int a = n;
          int fact=1;
          while(n>0){
               fact = fact*n;
               n--;
          }
          System.out.println(a+"! = "+fact);
         
          
     }
}