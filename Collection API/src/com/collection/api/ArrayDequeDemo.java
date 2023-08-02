package com.collection.api;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque a1 = new ArrayDeque();
        a1.add("Utkarsh");
        a1.add(10);
        a1.add(20);
        System.out.println(a1);

        a1.addFirst(100);
        a1.addLast(200);
        System.out.println(a1);


    }
}
