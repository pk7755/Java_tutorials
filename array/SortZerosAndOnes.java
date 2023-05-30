package array;

import java.util.Scanner;

public class SortZerosAndOnes {
	public static void swap(int ar[], int i, int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	public static void displayArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
		System.out.println();
	}
	public static void sortZerosAndOnes(int ar[]) {
		int n=ar.length;
		int zeroes=0;
		
		// count number of zeroes
		for(int i=0;i<n;i++) {
			if(ar[i]==0) {
				zeroes++;
			}
		}
		
		//0 to zeroes-1 : 0, zeroes to n-1 : 1
		for(int i=0;i<n;i++) {
			if(i<zeroes) {
				ar[i]=0;
			}
			else {
			ar[i]=1;
			}
		}
		
	}
	public static void ZeroesAndOnes(int ar[]) {
		int n=ar.length;
		int left=0,right=n-1;
		while(left<right) {
			if(ar[left]==1 && ar[right]==0) {
				swap(ar, left, right);
				left++;
				right--;
			}
			if(ar[left]==0) {
				left++;
			}
			if(ar[right]==1) {
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
		ZeroesAndOnes(ar);
		displayArray(ar);
	sc.close();	
	}
}
