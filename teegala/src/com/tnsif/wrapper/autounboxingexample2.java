package com.tnsif.wrapper;

public class autounboxingexample2 {

	public static void main(String[] args) {
		Double d = 99.99;     // Wrapper class
        double val = d;       // auto-unboxing
        System.out.println("Wrapper Double: " + d);
        System.out.println("Primitive double: " + val);

	}

}
