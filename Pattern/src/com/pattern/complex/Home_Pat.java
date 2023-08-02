package com.pattern.complex;

public class Home_Pat {
    public static void main(String[] args) {
        int n = 17;
        int x = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == (n - 1) / 2 || i + j == x / 2 || j - i == x + (x - 1) / 2 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
