package string;

public class Program4 {
	
	public static void main(String[] args) {
		// String declaration by using new keyword
		String s=new String("Pradyumna");
		String s1=new String("Pradyumna");
		System.out.println(s);
		System.out.println(s1);
		
		//To compare the address
		System.out.println(s==s1);
		
		// To compare the value at that address
		System.out.println(s.equals(s1));
		
		// this string is  mutable
		
		s="Pradyumna Kumar";
		System.out.println(s);
		
		
		
		
		
		   
	}

}
