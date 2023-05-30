import java.util.*;

public class PrimeNumber {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = sc.nextInt();
          sc.close();
          int i = 1;
          int fact = 0;
          while (i<=n) {
               if (n%i==0){
                    fact++;
               }
          i++;    
          }
          if(fact<=2){
               System.out.println("this is prime number.");
          }else{
               System.out.println("this isn't prime number.");
               
          }
         

     }

}