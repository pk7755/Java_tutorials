package Non_static;

public class Employ2 {
	static String cname = "Jspider Noida";
	String ename;
	int eid;
	double salary;
	public void setValue(String n, int e, double s) {
			ename = n;
			eid = e;
			salary = s;		
	}
	public void getValue() {
		System.out.println("===========================");
		System.out.println("The company name is :"+cname);
		System.out.println("The name is : "+ename);
		System.out.println("eid is : "+eid);
		System.out.println("Salary is : "+salary);
		giveBiometric();
		work();
	}
	
	public void giveBiometric() {
		System.out.println("Employ should give Biometric.");	
	}
	public void work() {
		System.out.println("Employ is working.");
	}
	public static void main(String[] args) {
		Employ2 e1 = new Employ2();
		e1.setValue("Pradyumna", 18786, 1234564);
		e1.getValue();
		Employ2 e2 = new Employ2();
		e2.setValue("Anand", 18734, 1234544);
		e2.getValue();
		Employ2 e3 = new Employ2();
		e3.setValue("vinay", 18756, 1235654);
		e3.getValue();
		Employ2 e4 = new Employ2();
		e4.setValue("Ayush", 18756, 1234343464);
		e4.getValue();
		
		
	}
}
