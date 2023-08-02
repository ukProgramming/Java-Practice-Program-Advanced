package com.exception.handling;

import java.util.Scanner;

class Alpha {
    public void division() {

        System.out.println(" Welcome to Division Performing Application:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Fist Number to Divide:");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number:");
        int b = scanner.nextInt();
        int res = a / b;
        System.out.println("Result=" + res);
    }
}

class Beta {
    public void disp() {
        try {
            Alpha alpha = new Alpha();
            alpha.division();
        } catch (ArithmeticException e) {
            System.out.println("Enter the Second Number Non Zero:");
        }

    }
}

public class LaunchException5 {

    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
    }
}