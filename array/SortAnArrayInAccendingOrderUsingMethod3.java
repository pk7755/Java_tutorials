package array;

public class SortAnArrayInAccendingOrderUsingMethod3 {
	public static void sortArray(int ar[]) {
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int a[] = {23,45,56,23,465,76,56};
		System.out.println(" Array before sorting");
		for(int i=0;i<a.length;i++ ) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
		sortArray(a);
		
		System.out.println("\n Array after sorting");
		for(int i=0;i<a.length;i++ ) {
			System.out.print(" "+a[i]);
		}
	}

}
