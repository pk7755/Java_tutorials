import java.util.*;

public class PerfectNumber {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = sc.nextInt();
          sc.close();
          int a = n;
          int i = 2;
          int sum = 1;
          while (i<=n/2) {
               while (a%i==0){
                    sum=sum+i;
                    a/=i;
               }
          i++;    
          }
          System.out.println(sum);
          if(sum==n){
               System.out.println("this is perfect number.");
          }else{
               System.out.println("this isn't perfect number.");
               
          }
         

     }

}
