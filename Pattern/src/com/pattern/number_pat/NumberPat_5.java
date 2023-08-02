package com.pattern.number_pat;

public class NumberPat_5 {
    public static void main(String[] args) {
        int n = 7;
        int l = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + l);
                l--;
            }
            l = 7;
            System.out.println();
        }
    }
}
