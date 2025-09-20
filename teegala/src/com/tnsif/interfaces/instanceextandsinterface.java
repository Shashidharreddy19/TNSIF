package com.tnsif.interfaces;


		// First interface
		interface Parent {
		    void parentMethod();
		}

		// Second interface extending Parent
		interface Child extends Parent {
		    void childMethod();
		}

		// Class implements the child interface (so it must implement both methods)
		class MyClass implements Child {
		    public void parentMethod() {
		        System.out.println("This is the Parent Interface method.");
		    }

		    public void childMethod() {
		        System.out.println("This is the Child Interface method.");
		    }
		}

		public class instanceextandsinterface {
		    public static void main(String[] args) {
		        MyClass obj = new MyClass();
		        obj.parentMethod(); // from Parent interface
		        obj.childMethod();  // from Child interface
		    }
		}

