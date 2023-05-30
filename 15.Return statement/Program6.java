class Program6
{

	public  static void main(String[] args)
	{
			System.out.println("This is main method");
			String p=test(47, 38);
			System.out.println(p+100);

			System.out.println(test(12, 56)+200);
				
	}

	public static String test(int a, int b)
	{
		System.out.println("The sum is: "+(a+b));
	return a+"  "+b;
		
	}
	
}