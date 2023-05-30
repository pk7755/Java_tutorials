package Non_static_block;

public class Employ {
	static String cname = "Jspider Noida";
	String ename;
	int eid;
	double salary;
	Employ(String n, int e, double s) {
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

}
