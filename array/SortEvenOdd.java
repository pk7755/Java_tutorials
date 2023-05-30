package array;

import java.util.Scanner;

public class SortEvenOdd {
	public static void swap(int ar[], int i, int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	public static void displayArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void sortArrayByParity(int ar[]) {
		int n=ar.length;
		int left=0,right=n-1;
		while(left<right) {
			if(ar[left]%2==1 && ar[right]%2 ==0) {
				swap(ar, left, right);
				left++;
				right--;
			}
			if(ar[left]%2 == 0) {
				left++;
			}
			if(ar[right]%2 == 1) {
				right--;
			}	
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		
		int size=sc.nextInt();
		System.out.println("Enter "+size+" elements");
		int ar[]= new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Array before sorting");
		displayArray(ar);
		System.out.println("Array after sorting");
		sortArrayByParity(ar);
		displayArray(ar);
	sc.close();	
	}
}
