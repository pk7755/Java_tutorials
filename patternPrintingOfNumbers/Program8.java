package patternPrintingOfNumbers;

public class Program8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int k =1;
			for(int j=0;j<n;j++) {
				if(i<=j)
					System.out.print(k++%2 +" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}

	}

}
