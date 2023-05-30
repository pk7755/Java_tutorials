package array;

public class _2DArray2 {
	public static void main(String[] args) {
		int ar[][]= {{1,2,3},{4,5},{7,8,9},{1,2,3},{1,2,3}};
		System.out.println(ar.length); // Jagged array 
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
		System.out.println();
		}	
	}
}
