package inheritance;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1=new Bank("ICICI", "ICIC02323", 201301);
		b1.displayBank();
		System.out.println("===================");
		SavingsAccount s1=new SavingsAccount("HDFC", "HDFC01313", 208308, "MOHAN",10000342, 32534546.46);
		s1.displaySavingsAccount();
	}

}
