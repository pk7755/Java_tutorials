import java.util.Scanner;

class Demo1{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your inputs");
	
	String e = s.next();
	s.nextLine();
 	String f = s.nextLine();
	String g = s.next();
	s.close();
  
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
    
	}
}