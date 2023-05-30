
import java.util.*;

class Program14 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the 1st number : ");
          int a = sc.nextInt();
          System.out.print("Enter the 2nd number : ");
          int b = sc.nextInt();
          System.out.println("Enter the operator which you want to perform : ");
          System.out.print("(+, -, /, *, % ) :");
          char c = sc.next().charAt(0);
          sc.close();

          switch (c) {
               case '+':
                    System.out.println("The sum is : " + (a + b));
                    break;
               case '-':
                    System.out.println("The sum is : " + (a - b));
                    break;
               case '*':
                    System.out.println("The sum is : " + (a * b));
                    break;
               case '/':
                    System.out.println("The sum is : " + (a / b));
                    break;
               case '%':
                    System.out.println("The sum is : " + (a % b));
                    break;
               default:
                    System.out.println("Please, Enter the valid operator !");
                    break;
          }

     }
}