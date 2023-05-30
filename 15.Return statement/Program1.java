class Program1
{

	public  static void main(String[] args)
	{
			System.out.println("This is main method");
			int p=findFactorial();
			System.out.println(p);
			System.out.println("=====================");
			System.out.println(findFactorial());	
	}

	public static int findFactorial()
	{
		int n=12;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	return fact;	
	}
	
}