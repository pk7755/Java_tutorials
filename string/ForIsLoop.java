package string;

public class ForIsLoop {
	public static void main(String[] args) {
		String s = "Java is a Programming language.";
		String s1[]=s.split(" ");
		
		for(String s2:s1) {
			System.out.println(s2);
		}
	}
}
