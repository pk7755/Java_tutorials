import java.util.Scanner;
class Program1{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number : ");
          float a = sc.nextFloat();
          System.out.print("Enter the second number : ");
          float b = sc.nextFloat();
          System.out.print("Enter the third number : ");
          float c = sc.nextFloat();
          sc.close();
          if (a>b){
               if (a>c){
                    System.out.println("The greatest number is :"+a);
               }
               else{
                    System.out.println("The biggest no is :"+c);
               }
          }
          else  {
               if (b>c){
               System.out.println("The biggest no is :"+b);
               }
               else{
                    System.out.println("The biggest no is :"+c);
               } 
          }
               

     }
}