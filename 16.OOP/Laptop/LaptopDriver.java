class LaptopDriver
{
	public static void main(String[] args)
	{
		Laptop l1 = new Laptop();
		l1.brand="HP ( Hewlett-Packard )";
		l1.model="HP Pavilion g4 Notebook PC"; 
		l1.processor="AMD64 Family 18 Model 1 Stepping 0 AuthenticAMD ~2200 Mhz";
		l1.core = 2;
		l1.ram = "4 GB";
		l1.rom = "500 GB (HDD) + 240 GB (SSD)";
		l1.price = 30000;
		
		System.out.println("--------------Details of the first Laptop--------------------");
		System.out.println("Brand : "+l1.brand);
		System.out.println("Model : "+l1.model);
		System.out.println("Processor : "+l1.processor);
		System.out.println("Core : "+l1.core);
		System.out.println("RAM : "+l1.ram);
		System.out.println("ROM : "+l1.rom);
		System.out.println("Price : "+l1.price);
		l1.power();

		
		Laptop l2 = new Laptop();
		l2.brand="HP ( Hewlett-Packard )";
		l2.model="HP Pavilion g5 Notebook PC"; 
		l2.processor="Intel-7~2200 Mhz";
		l2.core = 4;
		l2.ram = "8 GB";
		l2.rom = "1 TB (HDD) + 500 GB (SSD)";
		l2.price = 60000;
		
		System.out.println("--------------Details of the Second Laptop--------------------");
		System.out.println("Brand : "+l2.brand);
		System.out.println("Model : "+l2.model);
		System.out.println("Processor : "+l2.processor);
		System.out.println("Core : "+l2.core);
		System.out.println("RAM : "+l2.ram);
		System.out.println("ROM : "+l2.rom);
		System.out.println("Price : "+l2.price);
		l2.power();
	}
}