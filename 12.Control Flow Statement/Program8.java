import java.util.*;
public class Program8 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a character : ");
          char c = sc.next().charAt(0);
          sc.close();

          if (c >= 'A' && c <= 'Z' || c >= 'a' && c >= 'a' && c <= 'z' ){
               System.out.println("Enterd character is an Alphabet.");
          }
          else if (c >= '0' && c <= '9' ){
               System.out.println("Enterd character is a digit.");
          }
          else {
               System.out.println("Entered character is a special character.");
          }
     }
     
}
