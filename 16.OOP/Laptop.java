class Laptop
{
	static String cname="DELL";
	double price;
	int ramsize;
	
	public static void start()
	{
		System.out.println("Start the Laptop");
	}

	public  void explore()
	{
		System.out.println("explore the Laptop");
	}

	public static void main(String[] args)
	{
		System.out.println("=======static==========");
		System.out.println(cname);
		start();
		System.out.println("=======non-static==========");
		Laptop l1=new Laptop();
		System.out.println(l1.price);
		System.out.println(l1.ramsize);
		l1.explore();

		System.out.println(l1.cname);
		l1.start();
	}
}







