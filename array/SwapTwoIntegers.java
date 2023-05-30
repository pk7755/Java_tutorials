package array;

public class SwapTwoIntegers {
	
	static void swap(int a,int b) {
		System.out.println("Original value before swap");
		System.out.println("a : "+b);
		System.out.println("b : "+a);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Original value after swap");
		System.out.println("a : "+b);
		System.out.println("b : "+a);
	}
	static void swap1(int a,int b) {
		System.out.println("Original value before swap");
		System.out.println("a : "+b);
		System.out.println("b : "+a);
		b= a+b;
		a=b-a;
		b=b-a;
		System.out.println("Original value after swap");
		System.out.println("a : "+b);
		System.out.println("b : "+a);
		
	}
	public static void main(String[] args) {
		int x=10;
		int y=20;
		swap(x, y);
		int n=5;
		int m=4;
		swap1(n, m);

	}
}
