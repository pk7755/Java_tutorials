package string;

public class CapitalizeEachFirstLetterOfWord2 {
	public static void main(String[] args) {
		String s = "Java is a Programming language.";
		String s1[]=s.split(" ");
		String rev="";
		for(String s2:s1) {
			
			char ch[]=s2.toCharArray();
			for(int i=0;i<ch.length;i++) {
				rev+=ch[ch.length-1-i];	
			}
			rev+=" ";
		}
		System.out.print(rev);
		
	}
}
