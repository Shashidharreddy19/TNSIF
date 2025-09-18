package com.tnsif.encapsulation;

public class Encapsulations {

	public static void main(String[] args) {

		Encapsulation ob = new Encapsulation();
		System.out.println(ob.color);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		
		ob.start();
		ob.stop();


	}

}
