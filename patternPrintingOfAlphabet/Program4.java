package patternPrintingOfAlphabet;

public class Program4 {
	public static void main(String[] args) {
		int n=5;
		String k="A";
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print(k +" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}

}
