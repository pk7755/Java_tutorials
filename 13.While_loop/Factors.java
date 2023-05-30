import java.util.*;
public class Factors {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          sc.close();
          int i = 2;
          int a = n;
          System.out.println("1");
          while(i<=n/2){
               while (a%i==0){
                    System.out.println(i);
                    a = a/i;
                    
               }
               
               i++;
          
          }


     }
     
}
