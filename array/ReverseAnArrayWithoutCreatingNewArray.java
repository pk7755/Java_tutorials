package array;


public class ReverseAnArrayWithoutCreatingNewArray {
	static void swapInArray(int ar[],int i,int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	static void reverseArray(int ar[]) {
		int i=0, j=ar.length-1;
		
		while(i<j) {
			swapInArray(ar, i, j);
			i++;
			j--;
		}
	}
	static void printArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		
		System.out.println("Original Array befor Reversing");
		printArray(ar);
		
		reverseArray(ar);
		
		System.out.println("Original Array after Reversing");
		printArray(ar);
		
		
		
	}

}
