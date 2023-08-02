package com.pattern.number_pat;

public class NumberPat_3 {
    public static void main(String[] args) {
        int count = 7;
        int n = 4;
        int k = 7;

        int c = 1;
        // Upper Part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(c++);
                } else {
                    System.out.print(c++ + "*");
                }
            }
            System.out.println();
        }


        // Lower Parttern 
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count);

                if (j < i) {
                    System.out.print("*");
                }
                count++;
            }
            System.out.println();
            count = count - k;
            k = k - 2;
        }
    }
}
