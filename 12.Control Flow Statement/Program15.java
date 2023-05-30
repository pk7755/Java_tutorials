
import java.util.*;

class Program15 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the 1st number : ");
          int a = sc.nextInt();
          System.out.print("Enter the 2nd number : ");
          int b = sc.nextInt();
          System.out.println("Enter the operator which you want to perform : ");
          System.out.print("(+ for sum, - for diff, / for quot, * for mul, % for rem ) :");
          String c = sc.next();
          sc.close();

          switch (c) {
               case "sum":
                    System.out.println("The sum is : " + (a + b));
                    break;
               case "diff":
                    System.out.println("The sum is : " + (a - b));
                    break;
               case "quo":
                    System.out.println("The sum is : " + (a * b));
                    break;
               case "mul":
                    System.out.println("The sum is : " + (a / b));
                    break;
               case "rem":
                    System.out.println("The sum is : " + (a % b));
                    break;
               default:
                    System.out.println("Please, Enter the valid operator !");
                    break;
          }

     }
}
