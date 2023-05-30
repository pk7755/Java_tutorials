package inheritance;

public class Vegetable {
	int x=10;
	
	public void test()
	{
		System.out.println("This is test method");
		int x=20;
		System.out.println("Local x: "+x);
		System.out.println("Gloabl x: "+this.x);
	}

}
