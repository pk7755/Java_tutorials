package Interface;

public class Square implements Shape{
	double side;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	Square(double side){
		this.side=side;
	}
	public void findArea() {
		System.out.println("The area of square :"+side*side);
	}
	public void findPrimeter() {
		System.out.println("The primeter of square is :"+4*side);
	}

}
