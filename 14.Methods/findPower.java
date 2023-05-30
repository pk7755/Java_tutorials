import java.util.*;

public class findPower{
     public static void main(String[] args){
          power();
          power();
          
          
     }
     public static void power(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int a = sc.nextInt();
          System.out.print("Enter the power value : ");
          int b = sc.nextInt();
          int pow=1;
          int n=b;
          while(b>0){
               pow = pow * a;
               b--;
          }
          System.out.println("The value of "+a+"^"+n+" is : "+pow);
     }
}
