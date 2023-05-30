import java.util.Scanner;

class Demo3{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number number: ");
	int a = s.nextInt();
	String b = (a%2==0)?"Even":"Odd";
	s.close();
	
  
  	System.out.println(b);
      
    
	}
}