package array;

public class ArrangeFruitsNameInLexicographicalOrder {
	public static void sort(String ar[]) {
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[j].compareTo(ar[i])<0) {
					String temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		String arr[]= {"papaya","lime","watermelon","apple","mango","kiwi"};
		sort(arr);
		for (String string : arr) {
			System.out.print(string+ "   ");
			
		}
	}

}
