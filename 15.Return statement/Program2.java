class Program2
{

	public  static void main(String[] args)
	{
			System.out.println("This is main method");
			int p=findFactorial(9);
			System.out.println(p);
			System.out.println("=====================");
			System.out.println(findFactorial(11));	
	}

	public static int findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	return fact;	
	}
	
}