package com.tnsif.wrapper;

public class autounboxingexample3 {

	public static void main(String[] args) {
		 Character ch = 'Z';   // Wrapper class
	        char c = ch;          // auto-unboxing
	        System.out.println("Wrapper Character: " + ch);
	        System.out.println("Primitive char: " + c);

	}

}
