package string;

public class Program127 {
	public static void main(String[] args) {
		String s="Pradyuma Kumar";
		char ch[]=s.toCharArray();
		String upper="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
			
				char c=(char)(ch[i]-32);
				upper+=c;
			}else {
				upper+=ch[i];
			}
		}
		System.out.println(upper);
	}

}
