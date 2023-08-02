package com.pattern.complex;

public class StarPat_6 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Logic No:1");
        System.out.println("----------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        System.out.println("Logic No:2");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
