package Non_static;

public class Employ1 {
	static String cname = "Jspider Noida";
	String ename;
	int eid;
	public static void giveBiometric() {
		System.out.println("Employ should give Biometric.");	
	}
	public void work() {
		System.out.println("Employ is working.");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		giveBiometric();
		System.out.println("====================");
		Employ e1 = new Employ();
		e1.ename = "Prayumna Kumar";
		e1.eid=18786;
		System.out.println(e1.ename);
		System.out.println(e1.eid);
		e1.work();
		
		System.out.println("====================");
		Employ e2 = new Employ();
		e2.ename = "Shivam Kumar";
		e2.eid=18790;
		System.out.println(e2.ename);
		System.out.println(e2.eid);
		e2.work();	
	}
}
