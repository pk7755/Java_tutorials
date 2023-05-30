package method_overriding;

public class Car extends Vehicle{
	

	public void demo()
	{
		System.out.println("demo of Car");
	}
	
	
	@Override
	public void run()
	{
		System.out.println("run the Car");
	}

}
