import java.util.*;

class HCF {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the 1st No: ");
          int a = sc.nextInt();
          System.out.print("Enter the 2nd No: ");
          int b = sc.nextInt();
          System.out.print("Enter the 3rd No: ");
          int c = sc.nextInt();
          int small = (a<b)?((a<c)?a:c):((b<c)?b:c);
          sc.close();
          for (int i = small; i<=small; i--){
               if(a%i==0 && b%i==0 && c%i==0){
                    System.out.println("HCM is : "+i);
                    break;
               }
          }
     }
}