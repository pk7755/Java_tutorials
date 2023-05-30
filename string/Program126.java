package string;


public class Program126 {
	public static void main(String[] args) {
		String s="Pradyumna Kumar";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			count++;	
		}
		System.out.println("The length of the string  is : "+count);
	}

}
