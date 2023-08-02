package com.innerclass;

public class A {
    class B {
        class C {
            public void m1() {
                System.out.println(" m1() of inner Class.");
            }
        }
    }
}

class Demo1 {
    public static void main(String[] args) {
        new A().new B().new C().m1();
    }
}