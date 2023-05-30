package string;

public class Student2 {
	int rollNo;
	String name;
	Student2(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public String toString() {
		return rollNo+" "+name;
		
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2(101 , "Pradyumna Kumar");
		System.out.println(s);
		System.out.println(s.toString());
	}
}
