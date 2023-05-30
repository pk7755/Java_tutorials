package array;

public class ProblemsOnSorting {
	public static void sort(int ar[]) {
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = 0; j < ar.length-1-i; j++) {
				if(ar[j]==0 && ar[j+1]!=0) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
					
			}
		}
	}
	public static void main(String[] args) {
		int ar[]= {0,5,0,3,4,2};
		sort(ar);
		for (int i : ar) {
			System.out.print(i+" ");
		}
	}

}
