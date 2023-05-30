package Interface;

public class Rectangle implements Shape {
	double l;
	double w;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	Rectangle(double l,double w){
		this.l=l;
		this.w=w;
	}
	public void findArea() {
		System.out.println("The area of rectangle is :"+l*w);
	}
	public void findPrimeter() {
		System.out.println("The Primeter of rectangle is :"+2*(l+w));
	}

}
