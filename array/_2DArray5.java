package array;


public class _2DArray5 {
	public static void main(String[] args) {
		int ar[][]= {{11,12,13},{14,15,16},{17,18,19},{20,21,22},{23,24,25}};
		int newar[][]= new int[3][5];
		for(int i=0;i<newar.length;i++) {
			for(int j=0;j<newar[i].length;j++) {
				newar[i][j]=ar[j][i];
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(" "+ar[i][j]);
			}
		System.out.println();
		}
		System.out.println();System.out.println();
		for(int i=0;i<newar.length;i++) {
			for(int j=0;j<newar[i].length;j++) {
				System.out.print(" "+newar[i][j]);
			}
		System.out.println();
		}
	}

}
