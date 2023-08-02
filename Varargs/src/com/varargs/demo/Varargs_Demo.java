package com.varargs.demo;

class Varargs_Demo {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        int result = calculation.add(12, 10);
        System.out.println("Addition of Number of Using Varargs:" + result);

    }
}

class Calculation {
    public int add(int a, int b) {
        return a + b;
    }
}