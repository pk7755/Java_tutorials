package array;

public class SortAnArrayInAccendingOrderUsingMethod1 {
	public static char[] sortArray(char ar[]) {
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					char temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
		
	}
	public static void main(String[] args) {
		char ar[] = {'Z','D','E','G','A','B','R','P','C'};
		System.out.println(" Array before sorting");
		for(int i=0;i<ar.length;i++ ) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		
		sortArray(ar);
		
		System.out.println("\n Array after sorting");
		for(int i=0;i<ar.length;i++ ) {
			System.out.print(" "+ar[i]);
		}
	}

}
