package com.pattern.complex;

public class StarPat_7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
