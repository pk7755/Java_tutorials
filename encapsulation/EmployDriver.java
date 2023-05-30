package encapsulation;
import java.util.Scanner;
public class EmployDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Name: ");
		String a=sc.next();
		Employ e1=new Employ();
		e1.setName(a);
		System.out.println("Name is: "+e1.getName());
		sc.close();
	}

}
