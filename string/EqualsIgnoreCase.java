package string;


public class EqualsIgnoreCase {
	public static void main(String[] args) {
		String s="Java Program";
		String s1="JAVA PROGRAM";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}
