package com.pattern.complex;

public class StarPat_5 {
    int n = 5;

    public static void main(String[] args) {
        StarPat_5 starPat_5 = new StarPat_5();
        int x = starPat_5.n;
        for (int i = 1; i <= x; i++) {
            for (int j = x - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1; i <= x; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = x-1; k >= i; k--) {
//                System.out.print("*");
//            }
//            System.out.println();

        // }
    }
}
