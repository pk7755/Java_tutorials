package inheritance;
public class Bank extends Object{
	String bname;
	String ifsc;
	int pin;
	Bank()
	{	
	}
	Bank(String bname, String ifsc, int pin)
	{
		this.bname=bname;
		this.ifsc=ifsc;
		this.pin=pin;
	}
	public void displayBank()
	{
		System.out.println("Bank name is: "+bname);
		System.out.println("Bank ifsc is: "+ifsc);
		System.out.println("Bank pin is: "+pin);
	}

}
