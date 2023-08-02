package com.exception.handling;

import java.util.Scanner;

class Alpha1 {
    public void division() throws ArithmeticException {

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

class Beta1 {
    public void disp() {

        Alpha alpha = new Alpha();
        alpha.division();


    }
}

public class LauchException6 {
    public static void main(String[] args) {

        try {
            Beta1 beta1 = new Beta1();
            beta1.disp();
        } catch (ArithmeticException e) {
            System.out.println("Handling in Main Method...");
        }
    }
}
