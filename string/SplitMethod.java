package string;

public class SplitMethod {
	public static void main(String[] args) {
		String s = "Java is a Programming language.";
		String s1[]=s.split(" ");
		String s2[]=s.split("a");
		String s3[]=s.split("is");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]+" ");
		}
		System.out.println("=======================");
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]+" ");
		}
		System.out.println("=======================");
		for(int i=0;i<s3.length;i++) {
			System.out.println(s3[i]+" ");
		}
	}
}
