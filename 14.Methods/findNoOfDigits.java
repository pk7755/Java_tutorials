import java.util.*;

public class findNoOfDigits{
     public static void main(String[] args){
          digitCount();
          digitCount();
          digitCount();
          
          
     }
     public static void digitCount(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          int count = 0;
          int a = n;
          while(n>0){
               count++;
               n = n/10;
          }
          System.out.println(a+" have the "+count+" number of digits.");

     }
}