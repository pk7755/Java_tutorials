import java.util.Scanner;

class PraticeProblem{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int a = sc.nextInt();
	sc.close();
	String b = ((a%10==5)?"Yes":"No");
	System.out.println("The last digit of the numeber is 5 ? : "+b);
	
	
       
    }
}
