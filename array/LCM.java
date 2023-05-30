package array;

public class LCM {
	public static void main(String[] args) {
		int ar[]= {8,4,2,12,16};
		int big=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				big=ar[i];
				
			}
		}
		int i ;
		for(i=big;;i=i+big) {
			if(i%ar[0]==0&&i%ar[1]==0&&i%ar[2]==0&&i%ar[3]==0&&i%ar[4]==0)
				break;
		}
	System.out.print("LCM is : "+i);
	}
}
