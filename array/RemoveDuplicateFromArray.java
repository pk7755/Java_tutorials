package array;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int ar[] = { 2, 4, 4, 5, 7, 5, 7, 8, 5, 5 };
		System.out.println("Original array : ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					ar[j] = 0;
				}
			}
		}
		for (int j = 0; j < ar.length - 1; j++) {
			for (int i = 0; i < ar.length - 1 - j; i++)
				if (ar[i] == 0) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
		}
		System.out.println();
		System.out.println("After removing duplicate elements : ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
