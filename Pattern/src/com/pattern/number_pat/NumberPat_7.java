package com.pattern.number_pat;

public class NumberPat_7 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle

        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Print spaces to align the triangle
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Calculate and print the values for each row
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", num);
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
