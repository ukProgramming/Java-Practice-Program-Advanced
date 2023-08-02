package com.innerclass;

public class Hello  // public,default,final,abstract,static
{
    int x = 10; // Instance Variable of Outer Classes

    //static  int y=20;
    class By {

        int x = 100;// Instance variable of Inner class.

        public void m1() {
            int x = 1000; // Local Variable of Inner Class.
//            System.out.println("I Love Code....");
//            System.out.println(x);
//            System.out.println(y);
//            System.out.println(z);

            System.out.println(x);//1000
            System.out.println(this.x);//100
            System.out.println(Hello.this.x);//10
        }
    }
}

class Demo {
    public static void main(String[] args) {
        new Hello().new By().m1();
    }
}