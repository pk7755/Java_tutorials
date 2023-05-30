package string;

public class Student {
	int rollNo;
	String name;
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student s = new Student(101 , "Pradyumna Kumar");
		System.out.println(s);
		System.out.println(s.toString());
	}
}
