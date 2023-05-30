package method_Chaining;

public class StudentDriver {
	public static void main(String[] args) {
		
		
		Student.obj().setValue("Sohan", 21, 346).displayStudent();
	
		Student.obj().setValue("Mohan", 19, 108).displayStudent();
	}

}
