package patternPrintingOfNumbers;

public class Program1 {
	public static void main(String[] args) {
		int n=5;
		int k =10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print(k++ +" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}

}
