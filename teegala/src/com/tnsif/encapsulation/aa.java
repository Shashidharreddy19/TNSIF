package com.tnsif.encapsulation;

public class aa {

	protected String color = "Black";
	int seats = 6;
	String company = "Benz";
	
	public void start()
	{
		int a=10;
		System.out.println("The car has started");
	}
	void stop()
	{
		System.out.println("The car has stopped");
	}

}
class Hello extends aa{
	
	void show()
	{
		System.out.println(color);
}
}