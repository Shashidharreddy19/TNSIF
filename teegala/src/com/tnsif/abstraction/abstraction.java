package com.tnsif.abstraction;

public class abstraction {

	public abstract class Abstraction {

		public abstract void show();
		
		public void demo()
		{
			System.out.println("This is method");
		}
	}
	class Abstract1 extends Abstraction{
		
		public void show()
		{
			System.out.println("This is abstract method");
		}
	}
}