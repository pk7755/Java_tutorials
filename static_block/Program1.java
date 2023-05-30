package static_block;

public class Program1 {
	static {
		System.out.println("This is static block-1");
		int x=12;
		int y=40;
		System.out.println("The sum is : "+(x+y));
	}
	public static void main(String[] args) {
		System.out.println("This is main method.");
	}
	static {
		System.out.println("This is static block-2");
		int x=12;
		int y=40;
		System.out.println("The product is : "+(x*y));
	}

}
