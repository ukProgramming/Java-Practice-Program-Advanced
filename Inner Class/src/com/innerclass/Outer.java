package com.innerclass;

//Regular Classes.
// Withou any  modifier.

class Outer {
    public static void main(String[] args) {
        System.out.println("Main Method of Outer Class.");

//        Outer outer=new Outer();
//        Iner iner= outer.new Iner(); // Using Outer Class Object we can create inner class Object.
        //Outer.Iner iner1=new Outer().new Iner();
        // new Outer().new Iner().m1();
        //iner1.m1();

        Outer outer = new Outer();
        outer.m2();
    }

    public void m2() {
        Iner i = new Iner();
        i.m1();
    }

    class Iner {
        public void m1() {
            System.out.println("Inside Inner Class Method");
        }
    }

}
