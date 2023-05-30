import java.util.*;
public class Program3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the Year : ");
          int year = sc.nextInt();
          if ( year % 100 == 0){
               if (year % 400 ==0){
                    System.out.println("The enterd year is leap year.");
               } else
               {
                    System.out.println("The entered year is not leap year. ");
               }
          } else{
               if (year % 4 == 0){
                    System.out.println("The enterd year is leap year.");
               }else 
               {
                    System.out.println("The entered year is not leap year. ");  
               }
          }

          sc.close();
     }
}
