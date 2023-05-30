package string;

public class Program3 {
	
	public static void main(String[] args) {
		String s = "Pradyumna Kumar";
		String s1 = "Pradyumna Kumar";  // Duplicate string is not created in SCP - String constant pool
		s1="Pradyumna";					// if we are update the string than this is not possible but it will not give error it will assign this string at a new memory address
		System.out.println(s);			// String s1 only share the address of the s string 
		System.out.println(s1);
		System.out.println(s==s1);      
	}

}
