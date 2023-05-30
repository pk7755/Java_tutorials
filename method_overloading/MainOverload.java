package method_overloading;

public class MainOverload {
	public static void main(String[] args) {
		System.out.println("main with string[] parm.");
		main(12, 45);
		main(12.4);
	}
	
	public static void main(int a) {
		System.out.println("main with int parm.");
	}
	
	public static void main(int a, int b) {
		System.out.println("main with int, int parm.");
	}
	public static void main(int a, double b) {
		System.out.println("main with int, double parm.");
	}
	public static void main(double a) {
		System.out.println("main with double parm.");
	}




}
