import java.util.*;

class Lcm {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the 1st no: ");
          int a = sc.nextInt();
          System.out.println("enter the 2nd no: ");
          int b = sc.nextInt();
          System.out.println("enter the 3rd no: ");
          int c = sc.nextInt();
          int big = (a>b)?((a>c)?a:c):((b>c)?b:c);
          sc.close();
          for (int i = big; i>=big; i+=big){
               if(i%a==0 && i%b==0 && i%c==0){
                    System.out.println("LCM is : "+i);
                    break;
               }
          }
     }
}