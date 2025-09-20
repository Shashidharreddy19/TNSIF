package com.tnsif.jagged;

public class usingstatic {


    // Static method to display jagged array
    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line for each row
        }
    }

    public static void main(String[] args) {
        // Declare jagged array
        int[][] jagged = new int[3][];

        // Define different column sizes
        jagged[0] = new int[3];  // row 1 with 3 elements
        jagged[1] = new int[2];  // row 2 with 2 elements
        jagged[2] = new int[4];  // row 3 with 4 elements

        // Assign values
        int count = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count++;
            }
        }

        // Call static method to display jagged array
        System.out.println("Jagged Array Elements:");
        display(jagged);
    }
}
