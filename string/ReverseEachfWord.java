package string;

public class ReverseEachfWord {
	public static void main(String[] args) {
		String s = "Java Programming language.";
		String s1[]=s.split(" ");
		String upper="";
		for(String s2:s1) {
			String first=s2.substring(0,1);
			String afterFirst=s2.substring(1);
			upper+=first.toUpperCase()+afterFirst+" ";
		}
		System.out.println(upper);
	}

}
