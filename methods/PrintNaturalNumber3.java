package methods;


public class PrintNaturalNumber3 {
	public static void PrintNaturalNum(int n) {
		if(n>0) {
			
			PrintNaturalNum(n-1);
			System.out.println(n);
			
		}
	}
	public static void main(String[] args) {
		PrintNaturalNum(10);
		
	}

}
