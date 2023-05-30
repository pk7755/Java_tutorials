package array;

public class InsertionSort {
	/*
	 * let array is divided into two part first one is sorted and second one is
	 * unsorted part of the array. always let the first element of the array is part
	 * of sorted part Take one element from the unsorted part, iterate through the
	 * unsorted part and find the correct position of this element.
	 * stable sorting algorithm
	 * time complexity 
	 * worst case O(n^2)
	 * average case represented by theeta o(n^2)
	 * best case omega ohm(n)
	 */
	public static void insertionSort(int ar[]) {
		for (int i = 1; i < ar.length; i++) {
			int j = i;
			while (j > 0 && ar[j] < ar[j - 1]) {
				int temp = ar[j];
				ar[j] = ar[j - 1];
				ar[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 5, 2, 1, 45, 34, 2, 2, 2, 2, 2, 35, 46, 56, 3 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

}
