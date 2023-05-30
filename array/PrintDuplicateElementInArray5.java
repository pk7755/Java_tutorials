package array;

public class PrintDuplicateElementInArray5 {
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,12,34,45,12,45,34};
		int temp[]=new int[ar.length];
		System.out.println("Element  | Frequency");
		for (int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1 && count==1) {
				System.out.println(ar[i]+"       | "+count);
			}
		}
	}
}
