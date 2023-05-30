package constructor_overlaoding;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1 = new Employ("Pradyumna Kumar", 12343, 234343432);
		e1.getValue();
		Employ e2 = new Employ();
		e2.getValue();
		Employ e3 = new Employ("Vinay Shukla", 14543);
		e3.getValue();
		Employ e4 = new Employ(14543);
		e4.getValue();
		Employ e5 = new Employ("Vinay");
		e5.getValue();
		Employ e6 = new Employ("Shukla", 14543);
		e6.getValue();
	}

}
