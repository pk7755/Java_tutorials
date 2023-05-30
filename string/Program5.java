package string;


public class Program5 {
	public static void main(String[] args) {
		String s="Pradyumna Kumar 123";
		
		// It will give the letter of specified index
		char c = s.charAt(0);
		System.out.println(c);
		System.out.println();
		
		// It will capitalized each letter of a string
		String s1=s.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		// It will convert in lower case each letter of a string
		String s2=s.toLowerCase();
		System.out.println(s2);
		System.out.println();
		
		// It will give the length of string including space also
		int size=s.length();
		System.out.println(size);
		System.out.println();
		
		// Extra spaces at starting and end will be removed by trim() method
		// but the extra spaces b/w two words will not removed
		String s4=" Java Program   ";
		String s5=s4.trim();
		System.out.println(s5);
		
		//substring will give a specified part of original string
		System.out.println();
		System.out.println(s.substring(0));  	//Pradyuman Kumar
		System.out.println(s.substring(1));		//radyumna Kumar
		System.out.println(s.substring(1,5));	//rady
		System.out.println(s.substring(5));		//umna Kumar
		System.out.println(s.substring(6));		//mna Kumar
		System.out.println(s.substring(19)); 	//nothing
		
		//toCharArray() it will convert a string into a char array
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		
	}

}
