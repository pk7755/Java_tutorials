import java.util.*;

public class findFactorCount{
     public static void main(String[] args){
          
        FactorCount();
          
          
          
     }
     public static void FactorCount() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          int i=1;
          int count=1;
          while(i<=n/2){
			if (n%i==0)
			{
				count++;
				n = n/i;
			}
		i++;     
          }
          System.out.println("The Total no of factors is :"+count);
         
          
     }
}