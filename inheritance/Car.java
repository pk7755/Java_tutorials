package inheritance;

public class Car extends Vehicle{
	int p=60;
	int q=80;
	
	public void demo()
	{
		System.out.println("Demo method of Car");
		int r=90;
		System.out.println("Local r is: "+r);
		System.out.println("Global var of Car is: "+p+"  "+q);
		System.out.println("Global var of Vehicle: "+super.x+"  "+y);
		super.test();
		
		
	}

}
