import java.util.*;
public class Program5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a character Alphabet: ");
          char c = sc.next().charAt(0);
          sc.close();
          if (c >= 'A' && c <= 'Z' || c >= 'a' && c <='z'){
               if (c >= 'A' && c <= 'Z' ){
                    System.out.println("The entered character is in Uppercase Alphabet.");
               } else {

                    System.out.println("The entered character is in lowercase Alphabet.");
               }
          } else {
               System.out.println("Please, Enter Alphabets.");
          }
     }
}
