import java.util.*;

public class Program13 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the Cost price :");
          float a = sc.nextFloat();
          System.out.print("Enter the selling price :");
          float b = sc.nextFloat();
          sc.close();
          if (a > b) {
               float loss = ((a - b) / a) * 100;
               System.out.println("You are " + loss + " % in loss.");
          } else {
               float profit = ((b - a) / a) * 100;
               System.out.format("You are %.2f in Profit.",profit);
          }

          sc.close();

     }

}
