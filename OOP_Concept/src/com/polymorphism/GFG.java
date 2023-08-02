package com.polymorphism;

public class GFG {
    protected void getData() {
        System.out.println(" Inside GFG");
    }
}

class GeeksforGeeks extends GFG {

    protected void getData() {
        System.out.println("Inside GeeksForGeeks");
    }
}

class Test1 {
    public static void main(String[] args) {

        GFG gfg = new GeeksforGeeks();

        gfg.getData();

        //Tip: Child Class Cannot be use Reference Variable of Parent class.
    }
}
