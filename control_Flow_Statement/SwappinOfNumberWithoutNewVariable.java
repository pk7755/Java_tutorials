package control_Flow_Statement;

public class SwappinOfNumberWithoutNewVariable {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println(a+" befor swappin "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" after swappin "+b);
		
		

	}

}
