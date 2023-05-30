package array;

import java.util.Scanner;

public class QueryQuestionUsingFrequencyArray {
	public static int[] makeFrequecyArray(int arr[]) {
		int freq[]=new int[100005];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		
		System.out.println("Enter "+size+" elements");
		
		int ar[]= new int[size];
		int freq[]= new int[100005];
		
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		
		freq = makeFrequecyArray(ar);
		
		System.out.print("Enter number of queries : ");
		int q=sc.nextInt();
		
		while(q>0) {
			System.out.print("Enter the number : ");
			int a=sc.nextInt();
			if(freq[a]>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		q--;
		}
	sc.close();
	}

}
