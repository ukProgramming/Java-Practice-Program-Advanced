package com.pattern.number_pat;

public class NumberPat_6 {
    public static void main(String[] args) {
        int n = 7;
        int s = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s + " ");
                s--;
            }
            s = 7;
            System.out.println();
        }
    }
}
