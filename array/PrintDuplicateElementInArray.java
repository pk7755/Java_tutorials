package array;

public class PrintDuplicateElementInArray {
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,12,34,45};
		for (int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j])
					System.out.println("The duplicate element at ar["+i+"] is : "+ar[j]);
			}
		}
	}
}
