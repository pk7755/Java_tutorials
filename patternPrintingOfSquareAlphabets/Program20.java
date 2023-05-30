package patternPrintingOfSquareAlphabets;

public class Program20 {

	public static void main(String[] args) {
		int n=9;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(j==n/2) {
					System.out.print("@ ");
				}
				else if(j==n/2 || i+j==n-1 && i<=n/2 || i==j && i>=n/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		System.out.println();
		}

	}

}

