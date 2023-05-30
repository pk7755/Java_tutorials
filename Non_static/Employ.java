package Non_static;

public class Employ {
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
		Employ e1 = new Employ();
		System.out.println(e1.ename);
		System.out.println(e1.eid);
		e1.work();
		Employ e2 = new Employ();
		System.out.println(e2.ename);
		System.out.println(e2.eid);
		e2.work();	
	}

}
