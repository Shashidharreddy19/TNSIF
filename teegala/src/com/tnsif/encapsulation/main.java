package com.tnsif.encapsulation;

	import java.util.ArrayList;
	import java.util.LinkedList;

	public class Mains {

		public static void main(String[] args) {
			
			Prg1 obj = new Prg1();
			System.out.println(obj.color);
			System.out.println(obj.seats);
			System.out.println(obj.company);
			obj.start();
			obj.stop();
			
			ArrayList li = new ArrayList();
			li.add("Hii");
			

		}

	}
