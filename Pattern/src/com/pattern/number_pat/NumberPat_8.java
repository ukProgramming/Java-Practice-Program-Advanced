package com.pattern.number_pat;

public class NumberPat_8 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Loop for each column
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
