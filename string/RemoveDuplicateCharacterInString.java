package string;


public class RemoveDuplicateCharacterInString {
	public static void main(String[] args) {
		String s="123456787654334578";
		char ch[]=s.toCharArray();
		int temp[]=new int[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1) {
				System.out.println(ch[i]+" "+count);
			}
			
		}
	}

}
