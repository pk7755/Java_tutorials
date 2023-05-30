package inheritance;

public class CarDriver   {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		System.out.println(v1.x);
		System.out.println(v1.y);
		v1.test();
		System.out.println("===========================");
		Car c1=new Car();
		System.out.println(c1.p);
		System.out.println(c1.q);
		System.out.println(c1.x);
		System.out.println(c1.y);
		c1.test();
		c1.demo();
		
	}

}
