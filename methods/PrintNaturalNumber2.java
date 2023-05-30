package methods;


public class PrintNaturalNumber2 {
	public static void PrintNaturalNum(int n) {
		if(n>0) {
			System.out.println(n);
			PrintNaturalNum(n-1);
			
		}
	}
	public static void main(String[] args) {
		PrintNaturalNum(10);
		
	}

}
