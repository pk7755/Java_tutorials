package method_overloading;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("Main method");
		sum(13, 56);
		sum(12.5, 67);
		sum(12, 56, 67, 34);
		
	}
	public static void sum(int a, int b)
	{
		System.out.println("int , int arg method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void sum(int a, int b, int c)
	{
		System.out.println("int , int, int arg method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void sum(int a, int b, int c, int d)
	{
		System.out.println("int , int, int, int arg method");
		System.out.println("Sum is: "+(a+b+c+d));
	}
	public static void sum(int a, double b)
	{
		System.out.println("int , double arg method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void sum(double a, int b)
	{
		System.out.println("double , int arg method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void sum(double a, double b)
	{
		System.out.println("double , double arg method");
		System.out.println("Sum is: "+(a+b));
	}
}












