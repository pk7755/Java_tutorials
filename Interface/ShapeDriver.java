package Interface;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s1=new Circle(4);
		s1.findArea();
		s1.findPrimeter();
		System.out.println("====================================");
		Shape s2=new Rectangle(20,32);
		s2.findArea();
		s2.findPrimeter();
		System.out.println("====================================");
		Shape s3 = new Square(34);
		s3.findArea();
		s3.findPrimeter();
	}
}
