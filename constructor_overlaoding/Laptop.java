package constructor_overlaoding;


public class Laptop {
	String name;
	double price;
	String color;
	int ram;
	Laptop() {
		System.out.println("Laptop obj is created.");
	}
	Laptop(String name){
		this();
		this.name = name;
	}
	Laptop(String name, double price){
		this(name);
		this.price = price;
	}
	Laptop(String name, double price, String color){
		this(name,price);
		this.color = color;
	}
	Laptop(String name, double price, String color,int ram){
		this(name,price,color);
		this.ram = ram;
	}
	
}
