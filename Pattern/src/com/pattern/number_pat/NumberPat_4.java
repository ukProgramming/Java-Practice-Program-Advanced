package com.pattern.number_pat;

public class NumberPat_4 {
    public static void main(String[] args) {
        int n = 7;
        int l = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i + 1; j--) {
                System.out.print(1);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(l);

            }
            l++;
            System.out.println();
        }
    }
}
