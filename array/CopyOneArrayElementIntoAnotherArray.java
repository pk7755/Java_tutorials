package array;

public class CopyOneArrayElementIntoAnotherArray {
	public static void main(String[] args) {
		int ar[]=Program14.createArray(5);
		int newar[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++) {
			newar[i]=ar[ar.length-1-i];
		}
		System.out.println("\n\n********** AR[] **********");
		Program14.displayArray(ar);
		System.out.println("\n\n********** NEWAR[] **********");
		Program14.displayArray(newar);
	}

}
