package constructor_chaining;

public class Employ {
	static String cname = "Jspider Noida";
	String ename;
	int eid;
	double salary;
	Employ() {		
	}
	Employ(String name) {
		this.ename = name;		
	}
	Employ(int eid) {
		this.eid = eid;		
	}
	Employ(double salary) {
		this.salary = salary;		
	}
	Employ(String name, int eid) {
		this.ename = name;
		this.eid = eid;		
	}
	Employ(int eid, String name) {
		this.ename = name;
		this.eid = eid;		
	}
	Employ(String name, int eid, double salary) {
		this.ename = name;
		this.eid = eid;
		this.salary = salary;		
	}
	public void getValue() {
		System.out.println("===========================");
		System.out.println("The name is : "+ename);
		System.out.println("eid is : "+eid);
		System.out.println("Salary is : "+salary);
		
	}

}
