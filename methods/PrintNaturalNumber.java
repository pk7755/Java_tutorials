package methods;


public class PrintNaturalNumber {
	public static int PrintNaturalNum(int n) {
		
		if(n==1) {
			System.out.println(1);
			return 1;
		}
		else
			System.out.println(n);
		return PrintNaturalNum(n-1);
		
	}
	public static void main(String[] args) {
		PrintNaturalNum(10);
		
	}

}
