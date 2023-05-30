import java.util.*;

public class Program16 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a character : ");
          char c = sc.next().charAt(0);
          sc.close();
          switch (c) {
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
                    System.out.println("Character is vowel Alphabet.");
                    break;
               case 'b':
               case 'c':
               case 'd':
               case 'f':
               case 'g':
               case 'h':
               case 'j':
               case 'k':
               case 'l':
               case 'm':
               case 'n':
               case 'p':
               case 'q':
               case 'r':
               case 's':
               case 't':
               case 'v':
               case 'w':
               case 'x':
               case 'y':
               case 'z':
                    System.out.println("Character is consonant Alphabet.");
                    break;
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '0':
                    System.out.println("Digit character");
                    break;
               default:
                    System.out.println("Other character");
          }
     }

}
