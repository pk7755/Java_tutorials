package method_Chaining;
public class Student {
	String name;
	int age;
	int roll_no;
	public static  Student obj()
	{
		return new Student();
	}
	public Student setValue(String name, int age, int roll_no)
	{
		this.name=name;
		this.age=age;
		this.roll_no=roll_no;
		return this;
	}
	
	public void displayStudent()
	{
		System.out.println("Name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("ROll Number is: "+roll_no);
		System.out.println("=========================");
	}

}
