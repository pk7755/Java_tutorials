class Program1
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		int p = 24;
		int q = 40;		
		System.out.println(x++ > 50  && y++ > 10 || p++ > 20 || q++ > 30);
		System.out.println(p);
		System.out.println(q);
		System.out.println(x);
		System.out.println(y);
	}
}