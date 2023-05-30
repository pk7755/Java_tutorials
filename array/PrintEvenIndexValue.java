package array;

public class PrintEvenIndexValue {
	public static void main(String[] args) {
		int ar[]=Program14.createArray(10);
		System.out.println("\n***** Even index elements value ***** ");
		for(int i=0;i<ar.length;i++) {
			if(i%2==0)
				System.out.println("The value of ar ["+i+"] : "+ar[i]);
		}
	}

}
