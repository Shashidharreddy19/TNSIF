package com.tnsif.string;

public class string {

	public static void main(String[] args) {

		        String str1 = "Hello";
		        String str2 = "World";

		        // Concatenation
		        String concat = str1 + " " + str2;
		        System.out.println("Concatenation: " + concat);

		        // Length of string
		        System.out.println("Length of str1: " + str1.length());

		        // Character at position
		        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

		        // Substring
		        System.out.println("Substring of str2 (1 to 4): " + str2.substring(1, 4));

		        // Convert to uppercase and lowercase
		        System.out.println("Uppercase str1: " + str1.toUpperCase());
		        System.out.println("Lowercase str2: " + str2.toLowerCase());

		        // Equality check
		        System.out.println("str1 equals str2? " + str1.equals(str2));

		        // Replace
		        System.out.println("Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));
		    }
		}



