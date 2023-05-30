package array;

import java.util.Scanner;

public class SortSquared {
	public static int[] sortSquared(int[] ar) {
		int n=ar.length;
		int left=0,right=n-1;
		int ans[]=new int[n];
		int k=n-1;
		while(left<=right) {
			if(Math.abs(ar[left])> Math.abs(ar[right])) {
				ans[k--]=ar[left]*ar[left];	
				left++;
			}else {
				ans[k--]=ar[right]*ar[right];
				right--;
			}
		}
	return ans;
	}
	public static void swap(int ar[],int i, int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	public static void reverseArray(int[] ar) {
		int i=0,j=ar.length-1;
		while(i<j) {
			swap(ar,i,j);
			i++;
			j--;
		}
	}
	
	public static void displayArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : " );
		int size = sc.nextInt();
		System.out.println("Enter the "+size+" elements.");
		int ar[]=new int[size];
		int ans[]=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		ans = sortSquared(ar);
		displayArray(ans);
		
		
	sc.close();	
	}
}
