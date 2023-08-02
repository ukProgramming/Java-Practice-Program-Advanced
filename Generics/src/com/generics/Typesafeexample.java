package com.generics;

import java.util.ArrayList;

public class Typesafeexample {
    public static void main(String argd[]) {
        ArrayList al = new ArrayList();
        al.add("Utkarsh");
        al.add("Khalkar");
        al.add(new Integer(10));

        Integer str = (Integer) al.get(2);
        // ArrayList<int> aw=new ArrayList<int>()
        System.out.println(str);
    }
}
