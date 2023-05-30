package array;

public class findSmallestElementOfArray {
	public static void main(String[] args) {
		int r[]=Program14.createArray(4);
		int small=r[0];
		for (int i=1;i<r.length;i++) {
			if(small > r[i]) {
				small=r[i];
			}
		}
		System.out.print("\nThe Smallest element of array is : "+small);
	}

}
