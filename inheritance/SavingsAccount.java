package inheritance;

public class SavingsAccount extends Bank{
	String cus_name;
	int accno;
	double balance;
	SavingsAccount()
	{
	}
	SavingsAccount(String bname, String ifsc, int pin, String cus_name, int accno, double balance)
	{
		super(bname, ifsc, pin);
		this.cus_name=cus_name;
		this.accno=accno;
		this.balance=balance;
	}
	public void displaySavingsAccount()
	{
		super.displayBank();
		System.out.println("Customer name is: "+cus_name);
		System.out.println("Account number is: "+accno);
		System.out.println("Balance is: "+balance);
		System.out.println("==========================");
	}
	

}
