class Program1
{
	public static void main(String[] args)
	{
		int x = 12;
		int y = 20;
		
		System.out.println(!(x++ > 20 || y++ > 40));
		System.out.println(!(x/6!=2));
		System.out.println(x);
		System.out.println(y);
	}
}