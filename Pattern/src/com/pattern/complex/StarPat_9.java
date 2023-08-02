package com.pattern.complex;

public class StarPat_9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = n - 1; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
