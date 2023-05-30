import java.util.*;

public class StrongNumber {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = sc.nextInt();
          sc.close();
          int a = n;
          int i = 1;
          int j = 1;
          int sum = 0;
          long fact = 1;
          while (n>0) {
               i = n%10;
               while(j>=i){
                    fact = fact *i;
                    sum += fact;
                    j++;
               }
               n = n/10;     
               i++;    
          }
          if(sum==a){
               System.out.println("this is strong number.");
          }else{
               System.out.println("this isn't strong number.");
               
          }
         

     }

}
