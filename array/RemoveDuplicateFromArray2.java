package array;
public class RemoveDuplicateFromArray2 {
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,12,34,45,12,45,34};
		int temp[]=new int[ar.length];
		for (int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1) {
				System.out.println(ar[i]+"       | "+count);
			}
		}
	}

}
