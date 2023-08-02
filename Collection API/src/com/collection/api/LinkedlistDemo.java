package com.collection.api;

import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add("Utkarsh");
        l1.add("OM");
        l1.add('U');
        l1.add(101);
        System.out.println(l1);

        l1.add(3, "Nashik");
        System.out.println(l1);

        l1.addFirst("iNeuron");
        l1.addLast("Javapoint");

        System.out.println(l1);


        LinkedList l2 = new LinkedList();

        l2.add("Pune");
        l2.offer("Mumbai");
        System.out.println(l2);


    }

}
