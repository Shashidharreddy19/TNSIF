package com.tnsif.arrays;

public class array2d {

    public static void main(String[] args) {
        int[][] num = new int[3][4]; // 3x4 array

        // Fill array with random numbers (0–9)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 100);
            }
        }

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}

