package array;


public class FindMissingElementInArray {
	public static void main(String[] args) {
		int ar[]= {11,15,16,17,18,19,23,24,25};
		for(int i=0;i<ar.length-1;i++) {
			for (int j=ar[i]+1;j<ar[i+1];j++) {
				System.out.println(j);
			}
		}
	}

}
