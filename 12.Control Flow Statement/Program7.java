import java.util.*;

public class Program7 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Please Enter a alphabet character :");
          char c = sc.next().charAt(0);
          sc.close();
          if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
               if (c == 'a' || c == 'A') {
                    System.out.println("The entered character is vowel.");
               } else if (c == 'e' || c == 'E') {
                    System.out.println("The entered character is vowel.");
               } else if (c == 'i' || c == 'I') {
                    System.out.println("The entered character is vowel.");
               } else if (c == 'o' || c == 'O') {
                    System.out.println("The entered character is vowel.");
               } else if (c == 'u' || c == 'U') {
                    System.out.println("The entered character is vowel.");
               } else {
                    System.out.println("The enterd character is consonant.");
               }
          } else {
               System.out.println("This isn't alphabet character !");
          }
     }
}
