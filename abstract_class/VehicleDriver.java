package abstract_class;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1= new Maruti();
		v1.accelerate();
		v1.start();
		v1.stop();
		Car c1=new Maruti();
		c1.accelerate();
		c1.accelerate();
		c1.start();
		c1.stop();
		c1.playMusic();
		
	}

}
