package patternPrintingOfTriangles;

public class Program15 {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1)
					System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int i=n-2;i>=1;i--) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1)
					System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
