import java.util.*;

public class findPerfect{
     public static void main(String[] args){
          perfect();
          perfect();
          perfect();
          
     }
     public static void perfect(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          int a = n;
          int i = 1;
          int sum = 0;
          while (i<=n/2) {
               if (n%i==0){
                    sum=sum+i;
               }
          i++;    
          }
          if(sum==a){
               System.out.println("this is perfect number.");
          }else{
               System.out.println("this isn't perfect number.");
               
          }
         

     }
}