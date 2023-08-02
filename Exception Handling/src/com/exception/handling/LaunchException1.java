package com.exception.handling;

class Demo {
    public void disp() {
        disp();
    }
}

public class LaunchException1 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.disp();
    }
}
