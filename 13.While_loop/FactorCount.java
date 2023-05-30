import java.util.*;
public class FactorCount {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          sc.close();
          int a=n;
          int count=1;
          for(int i=1;i<=n/2;i++){
               while(a%i==0){
                    if(i==1){
                         System.out.println(i);
                         break;
                    }else{
                    a/=i;
                    count++;
                    System.out.println(i);
                    }
               }
          }

          System.out.println("The no of factors is : "+count);  

     }
     
}

