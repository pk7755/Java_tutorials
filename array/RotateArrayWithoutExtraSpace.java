 package array;

import java.util.Scanner;

public class RotateArrayWithoutExtraSpace {
	static void swapInArray(int ar[],int i,int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;	
	}
	static void revese(int[] ar,int i,int j) {
		while(i<j) {
			swapInArray(ar, i, j);
			i++;
			j--;
		}
	}
	static void rotateArray(int[] ar, int k) {
		int n= ar.length;
		k=k%n;
		revese(ar,0,n-k-1);
		revese(ar,n-k,n-1);
		revese(ar,0,n-1);	
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
		
		
		System.out.print("Enter k: ");
		int k=sc.nextInt();
		
		
		
		System.out.println("Original Array befor Rotation");
		printArray(ar);
		
		rotateArray(ar, k);
		
		System.out.println("Original Array after Rotation");
		printArray(ar);	
		
		sc.close();
		
	}
}
