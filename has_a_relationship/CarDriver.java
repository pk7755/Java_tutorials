package has_a_relationship;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("Maruti",32432432.23);
		c1.displayCar();
		
		Car c2=new Car("Honda",2342343.34,new Engine(80,8,"petrol"));
		c2.displayCar();
		
		Car c3=new Car("Tesla",2342343.34,new Engine(80,8,"hybrid"));
		c3.displayCar();
	}

}
