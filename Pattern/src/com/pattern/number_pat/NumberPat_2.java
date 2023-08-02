package com.pattern.number_pat;

public class NumberPat_2 {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(count++);
                } else {
                    System.out.print(count++ + "*");
                }
            }
            System.out.println();
        }

        int start = 7;


        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(start + j);
                if (j < i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            start -= i;
        }

    }
}
