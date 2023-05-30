import java.util.*;
public class DigitCount{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          sc.close();
          
          int count=0;

          while(n>0){
               n = n/10; 
               count++;
          }
          System.out.println("The no of digit in entered number is : "+count);  

     }
     
}


