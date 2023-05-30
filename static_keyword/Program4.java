package static_keyword;
public class Program4 {
	static int a=24;
	public static void main(String[] args) {
		System.out.println(a);//global
		a=30;//global
		System.out.println(a);//global
		int a=45;//local
		System.out.println(a);//local
		a=60;//local
		System.out.println(a);//local
		System.out.println(Program4.a);//global
		Program4.a=120;//global
		System.out.println(Program4.a);//global
	}

}
