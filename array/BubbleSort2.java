package array;

public class BubbleSort2 {
	/*
	 * stable sort because relative order of original array will not be changed .
	 * array = 1,3,4,2,4*
	 * sorted array = 1,2,3,4,4* 
	 * the order of 4 will not be  changed so it is called as stable sort
	 * time complexity 
	 * worst case O(n^2)
	 * average case represented by theeta o(n^2)
	 * best case omega ohm(n)
	 */
	public static void bubbleSort(int[] arr) {
		int h=0;
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++ ) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				System.out.println(h++);
			}
			if(!flag) {
				return;
			}
		}
	}
	public static void main(String[] args) {

		int arr[]= {1,2,2,3,4,4,5,5,5,6,7,8,8,8};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
