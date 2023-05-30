package array;

public class HCF {
	public static void main(String[] args) {
		int ar[]= {8,24,40,72,80};
		int small=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]<ar[i+1]) {
				small=ar[i];
				
			}
		}
		int i ;
		for(i=small;;i--) {
			if(ar[0]%i==0&&ar[1]%i==0&&ar[2]%i==0&&ar[3]%i==0&&ar[4]%i==0)
				break;
		}
	System.out.print("HCF is : "+i);
	}
}
