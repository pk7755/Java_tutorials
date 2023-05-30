package encapsulation;
import java.util.Scanner;
public class Employ {
	private static int spwd=1234;
	private String name;
	private int eid;
	private double salary;
	Employ()
	{
	}
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int upwd=sc.nextInt();
		if(spwd==upwd)
		{
			System.out.println("Password validation is successful");
			return name;
		}
		else
		{
			System.out.println("Password is invalid!!");
			return null;
		}
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int upwd=sc.nextInt();
		if(spwd==upwd)
		{
			System.out.println("Password validation is successful and name is set");
			this.name=name;
		}
		else
		{
			System.out.println("Password is invalid and name is not set!!");
		}
	}
	public int getEid()
	{
		//validate
		return eid;
	}
	public void setEid(int eid)
	{
		//validate
		this.eid=eid;
	}
	public double getSalary()
	{
		//validate
		return salary;
	}
	public void setSalary(double salary)
	{
		//validate
		this.salary=salary;
	}
	
	
	

}
