package array;


public class ReverseAnArray {
	static int[] ReverseArray(int ar[]) {
		int r[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			r[i]=ar[ar.length-1-i];		
		}
		return r;
	}
	static void PrintArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,34,34,3242,34,432,432,432,432,432,432,4};
		
		System.out.println("Original Array befor Reversing");
		PrintArray(ar);
		
		ar =ReverseArray(ar);
		
		System.out.println("Original Array after Reversing");
		PrintArray(ar);
		
		
		
	}

}
