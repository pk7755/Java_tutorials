package array;
/*
 * unstable sort because relative order of original array will be changed .
 * array = 1,3,4,2,4*
 * sorted array = 1,2,3,4*,4 
 * the order of 4 will be changed so it is called as unstable sort
 * time complexity 
	 * worst case O (n^2)
	 * average case represented by theeta o(n^2)
	 * best case omega ohm(n^2)
 */

public class SelectionSort {
	public static void selectionSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 5, 2, 1, 45, 34, 2, 2, 2, 2, 2, 35, 46, 56, 3 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
