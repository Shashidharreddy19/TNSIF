package com.tnsif.interfaces;

public interface interfacedemo {

	int a=10;
	void show();
}

class Samp implements interfacedemo{
	public void show()
	{
		System.out.println("This is implementing class");
	}
}
