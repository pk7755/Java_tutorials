package string;

public class Program2 {
	
	public static void main(String[] args) {
		String s = "Pradyumna Kumar";
		String s1 = "Pradyumna Kumar";  // Duplicate string is not created in SCP - String constant pool
		System.out.println(s);			// The same memory address is share to the both variables 
		System.out.println(s1);
		System.out.println(s==s1);      
		String s2 = "pradyumna kumar";
		String s3 = "pradyumna";
		System.out.println(s==s2);
		System.out.println(s2);
		System.out.println(s3);
	}

}
