package abstract_class;

public abstract class Vehicle {
	public abstract void start();
	
	public abstract void stop();
	
	public void run() {
		System.out.println("Run the vehicle");
	}
	public void accelerate() {
		System.out.println("Accelarate the vehicle");
	}

}
