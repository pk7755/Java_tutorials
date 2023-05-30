package array;

import java.util.Scanner;

public class _2DArray4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[][]= new int[5][3];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		sc.close();
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(" "+ar[i][j]);
			}
		System.out.println();
		}
	}

}
