package java_program;

public class SwapOfTwoNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swaping : "+a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping : "+a+" "+b);
	}
}
