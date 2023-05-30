package array;

import java.util.Scanner;

public class RotateArray2 {

	static int[] rotateArray(int[] ar,int k) {
		int n=ar.length;
		k%=n;
		int[] ans= new int[n];
		int j=0;
		
		for(int i=n-k;i<n;i++) {
			ans[j++]=ar[i];
		}
		
		for(int i=0;i<n-k;i++) {
			ans[j++]=ar[i];
		}
	return ans;		
	}
	static void printArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
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
		
		
		System.out.println("Enter k: ");
		int k=sc.nextInt();
		
		
		
		System.out.println("Original Array befor Reversing");
		printArray(ar);
		
		ar =rotateArray(ar,k);
		
		System.out.println("Original Array after Reversing");
		printArray(ar);	
		
		sc.close();
		
	}
}
