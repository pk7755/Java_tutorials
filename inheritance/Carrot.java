package inheritance;

public class Carrot extends Vegetable{
	int x=30;
	int y=78;
	
	public void demo()
	{
		System.out.println("This is demo method");
		int x=40;
		System.out.println("Local x is: "+x);
		System.out.println("Global x of Carrot is: "+this.x);
		System.out.println("GLobal x of Vegetable is: "+super.x);
	}

}
