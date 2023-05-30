package array;

public class SortAnArrayInAccendingOrder {
	public static void main(String[] args) {
		int ar[] = {12,34,56,33,22,23,24,56,32};
		System.out.println(" Array before sorting");
		for(int i=0;i<ar.length;i++ ) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("\n Array after sorting");
		for(int i=0;i<ar.length;i++ ) {
			System.out.print(" "+ar[i]);
		}
	}

}
