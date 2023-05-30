package java_program;

public class Pattern {
	public static void main(String[] args) {
		int n=7;
		char num='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		char num1='O';
		for(int i=n-2;i>=0;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print(num1-- +" ");
			}
			System.out.println();
		}
		
	}

}
