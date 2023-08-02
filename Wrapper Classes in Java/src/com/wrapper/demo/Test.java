package com.wrapper.demo;

import com.sun.security.jgss.GSSUtil;

public class Test {
    public static void main(String[] args) {
        /*
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);

        System.out.println(i1); // toString() method is called automatically by JVM to return the Content of the Wrapper Classes.
        System.out.println(i1.equals(i2));//true        */

        /* Utility Methods(Helper Method/ Static Method)
        1. valueOf()
            This method is used to convert the Primitive or String into Wrapper Object.

        2.XXXvalue()
            This method use to convert the wrapper into Primitive type.

        3.parseXXX()
            This method is used to convert the string object to corresponding primitive type.

         */

        // Example of valueOf()
        // # Example 1
        /*
        Integer i1=new Integer(10);
        Integer i2=new Integer("10");

        //usage of Utility method
        Integer i3=Integer.valueOf(10);
        Integer i4=Integer.valueOf("10");

        System.out.println(i1);//10
        System.out.println(i2);//10
        System.out.println(i3);//10
        System.out.println(i4);//10 */

        // Example 2

        /*Integer i1=Integer.valueOf(10);
        Boolean b1=Boolean.valueOf("UTKARSH");
        Double d1=Double.valueOf(10.5);
        Character c1=Character.valueOf('U');

        System.out.println(i1);//10
        System.out.println(b1);//false
        System.out.println(d1);//10.5
        System.out.println(c1);//U */

        //Example of XXXValue()

        Integer i1=new Integer(156);

        byte b1=i1.byteValue();
        int i2=i1.intValue();
        long l1=i1.intValue();
        short s1=i1.shortValue();
        long l2=i1.longValue();
        double d1=i1.doubleValue();

        System.out.println("Byte="+b1);// -128 to 127
        System.out.println("Int="+i2);
        System.out.println("Long="+l1);
        System.out.println("Short="+s1);
        System.out.println("Double="+d1);


        Character c1=new Character('U');
        char c2=c1.charValue();
        System.out.println(c2);


        Boolean b3=new Boolean("TruE");
        boolean b4=b3.booleanValue();
        System.out.println(b4);

    }
}
