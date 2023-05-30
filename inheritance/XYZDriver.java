package inheritance;

public class XYZDriver {
	public static void main(String[] args) {
		X x=new Z();
		System.out.println(x.a);
		System.out.println("==================");
		Y y=new Z();
		System.out.println(y.a);
		System.out.println(y.b);
		System.out.println("===================");
		Z z=new Z();
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
		System.out.println("==================");
		X x1=new Z();
		Z z1=(Z)x1;
		System.out.println(z1.a);
		System.out.println(z1.b);
		System.out.println(z1.c);
	}

}
