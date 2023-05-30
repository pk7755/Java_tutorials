import java.util.Scanner;

public class Program3{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the four number : ");

	float a = sc.nextFloat();

	float b = sc.nextFloat();

	float c = sc.nextFloat();

	float d = sc.nextFloat();
	sc.close();

	// float e = (a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:d):((c>d)?c:d));
	// float f = (a<b)?((a<c)?((a<d)?a:d):((c<d)?c:d)):((b<c)?((b<d)?b:d):((c<d)?c:d));

	float x = a>b ? a:b;
	float y = x>c ? x:c;
	float z = y>d ? y:d;
	System.out.println("The greatest number is :"+z);

	// System.out.println("The greatest number is : "+e);
	// System.out.println("The smallest number is : "+f);
	
	
       
    }
}
