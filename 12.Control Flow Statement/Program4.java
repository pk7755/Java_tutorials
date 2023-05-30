import java.util.*;
public class Program4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a character : ");
          char c = sc.next().charAt(0);
          sc.close();
          if (c >= 'A' && c<= 'Z' || c>= 'a' && c<= 'z'){
               System.out.println("The entered character is an Alphabet.");
          } else {
               System.out.println("The enterd character is not an alphabet.");
          }
     
     }
}
