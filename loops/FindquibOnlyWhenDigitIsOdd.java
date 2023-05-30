package loops;

public class FindquibOnlyWhenDigitIsOdd {

	public static void main(String[] args) {
		int n = 2345;
		while(n>0) {
			int r = n%10;
			if (r%2!=0) {
				System.out.println(r*r*r);
			}
			n = n/10;
		}

	}

}
