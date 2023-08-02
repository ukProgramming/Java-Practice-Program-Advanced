package com.polymorphism;

public class GFG1 {
    protected void getData() {
        System.out.println(" Inside GFG");
    }

    protected void getValue() {
        System.out.println("sdjfg");
    }
}

class GeeksForGeeks1 extends GFG1 {

    protected void getData() {
        System.out.println("Inside GeeksForGeeks");
    }

    protected void getValue() {
        System.out.println(" Java...........");
    }
}

class Test2 {
    public static void main(String[] args) {
        GFG1 gfg1 = new GeeksForGeeks1();
        gfg1.getValue();
    }
}
