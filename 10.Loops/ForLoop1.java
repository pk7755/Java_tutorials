import java.util.Scanner;
public class ForLoop1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          sc.close();
          for (int i = 1; i <= n ; n--  ){
               System.out.println(n);
          }
     }
}
