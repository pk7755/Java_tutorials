import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three sides of triangle : ");
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	float c = sc.nextFloat();
	sc.close();
	String d = (((a + b)> c) && ((b + c)> a) && ((c + a)> b))?" Triangle is valid " : "Triangle is Invalid";
	System.out.println(d);
    }
}
