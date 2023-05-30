package array;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int h=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++ ) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
				System.out.println(h++);
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
