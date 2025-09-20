package com.tnsif.jagged;

public class usingdynamic {

		 static void display(int[][] num) {
		        for (int[] x : num) {
		            for (int y : x) {
		                System.out.print(y + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static void main(String[] args) {
		        // Jagged array initialization
		        int[][] num = { {1}, {2, 3}, {4, 5, 6} };

		        // Call static method
		        display(num);
		
	}

}
