package com.StaticDemo;


class Static1 {
    private static int age; // Static Varible
    private static String name;

    static {

        System.out.println("Static Block Called..");
        age = 10;
        name = "Utkarsh";
    }

    int a, b, c;

    {
        a = 10;
        b = 20;
        c = 30;
    }

    public static void display() {
        System.out.println("Static Method Called..");
        System.out.println(age);
        System.out.println(name);

    }

    public void display1() {
        System.out.println("Non Static Method Called...");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(age);
        System.out.println(name);
    }
}

public class LaunchStatic1 {
    public static void main(String[] args) {

        Static1.display();
        Static1 static1 = new Static1();
        static1.display1();

    }
}
