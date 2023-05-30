class StudentDriver
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "Pradyumna Kumar";
		s1.roll_no = 18786;
		s1.height = 168;
		Student s2 = new Student();
		s2.name = "Shivam Kumar";
		s2.roll_no = 18790;
		s2.height = 172;
		System.out.println("The Details of frist Student.");
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		System.out.println(s1.height);
		
		s1.study();
		System.out.println("The Details of Second Student.");
		System.out.println(s2.name);
		System.out.println(s2.roll_no);
		System.out.println(s2.height);
		s2.study();
	}
}