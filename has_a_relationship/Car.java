package has_a_relationship;

public class Car {
	String name;
	double price;
	Engine e=new Engine(60,6,"diesel");
	Car(){
		
	}
	Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	Car(String name,double price,Engine e){
		this(name,price);
		this.e=e;
	}
	public void displayCar() {
		System.out.println("Car name is : "+name);
		System.out.println("Car price is : "+price);
		e.displayEngine();
	
	}
}
