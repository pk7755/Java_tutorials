import java.util.Scanner;

class Demo2{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a = s.nextInt();
	System.out.print("Enter Second number: ");
	int b = s.nextInt();
	String c = (a > b) ? "A is greater then B.":"A is lesser then B.";
     s.close();
      System.out.println(c);
      
    
	}
}