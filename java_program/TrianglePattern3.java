package java_program;

public class TrianglePattern3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int num=1;
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			int num=1;
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}

}
