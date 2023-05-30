package string;


public class RemoveDuplicateCharacterInString2 {
	public static void main(String[] args) {
		String s="Pradyumna Kumar";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]);
				}
			}
			
		}
	}

}
