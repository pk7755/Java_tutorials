package patternPrintingOfTrianglesWithTheHelpOfThreeLoop;

public class Program5 {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
