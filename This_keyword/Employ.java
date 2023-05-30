package This_keyword;

public class Employ {
	static String cname = "Jspider Noida";
	String ename;
	int eid;
	double salary;
	Employ(String name, int eid, double salary) {
		this.ename = name;
		this.eid = eid;
		this.salary = salary;		
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
