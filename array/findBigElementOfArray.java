package array;

public class findBigElementOfArray {
	public static void main(String[] args) {
		int r[]=Program14.createArray(4);
		int big=r[0];
		for (int i=1;i<r.length;i++) {
			if(big < r[i]) {
				big=r[i];
			}
		}
		System.out.print("The biggest element of array is : "+big);
	}

}
