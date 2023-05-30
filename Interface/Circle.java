package Interface;

public class Circle implements Shape {
	 double radius;
	 Circle(){
		 
	 }
	 Circle(double radius){
		 this.radius=radius;
	 }
	 public void findArea() {
		 System.out.println("The area of circle is :"+ 3.14*radius*radius);
	 }
	 public void findPrimeter() {
		 System.out.println("The Primeter of circle is :"+2*3.14*radius);
	 }

}
