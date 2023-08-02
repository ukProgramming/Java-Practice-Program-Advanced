package com.exception.handling;

import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            System.out.println(" Welcome to Division Performing Application:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Fist Number to Divide:");
            int a = scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println("Result=" + res);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Thank You for Using our Application:");
        }


    }
}

