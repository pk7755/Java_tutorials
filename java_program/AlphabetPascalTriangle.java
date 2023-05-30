package java_program;


public class AlphabetPascalTriangle {
	public static void main(String[] args) {
		int n=10;
		char c='A';
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(c++ +" ");	
			    
			}
		System.out.println();
		}
	}	
}
