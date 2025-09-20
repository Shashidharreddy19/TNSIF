package com.tnsif.string;

public class stringBuffer {

	public static void main(String[] args) {
		        // Creating StringBuffer
		        StringBuffer sb = new StringBuffer("Hello");

		        // Append text
		        sb.append(" World");
		        System.out.println("After append: " + sb);

		        // Insert text
		        sb.insert(5, " Java");
		        System.out.println("After insert: " + sb);

		        // Replace part of text
		        sb.replace(6, 10, "C++");
		        System.out.println("After replace: " + sb);

		        // Delete part of text
		        sb.delete(6, 9);
		        System.out.println("After delete: " + sb);

		        // Reverse the string
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        // Length and Capacity
		        System.out.println("Length: " + sb.length());
		        System.out.println("Capacity: " + sb.capacity());
		    }
		}


