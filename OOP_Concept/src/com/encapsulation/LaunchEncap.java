package com.encapsulation;

class Test {

    private int age; // Private access Specifier.

    public int getAge()// Getter
    {
        return age;
    }

    public void setAge(int age) // Setter
    {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please Enter the Valid Age...........");
        }

    }

}

public class LaunchEncap {
    public static void main(String[] args) {

        Test test = new Test();
        //System.out.println(test.age=-10);
        test.setAge(10);
        System.out.println(test.getAge());

    }
}
