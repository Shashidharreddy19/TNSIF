package com.tnsif.string;

public class stringbuilder {

	public static void main(String[] args) {
		        // Create StringBuilder object
		        StringBuilder sb = new StringBuilder("Hello");

		        // Append
		        sb.append(" World");
		        System.out.println("After append: " + sb);

		        // Insert
		        sb.insert(5, " Java");
		        System.out.println("After insert: " + sb);

		        // Replace
		        sb.replace(6, 10, "C++");
		        System.out.println("After replace: " + sb);

		        // Delete
		        sb.delete(6, 9);
		        System.out.println("After delete: " + sb);

		        // Reverse
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        // Length and Capacity
		        System.out.println("Length: " + sb.length());
		        System.out.println("Capacity: " + sb.capacity());
		    }
		}

