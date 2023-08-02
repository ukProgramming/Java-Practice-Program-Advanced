package com.encapsulation;

public class CountObject {

    static int count;
    int roll_no;
    String name;
    int age;

    {
        count++;
    }

    CountObject() {
        roll_no = 76;
        name = "Utkarsh";

        System.out.println("Roll No=" + roll_no);
        System.out.println("Name=" + name);
    }

    CountObject(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;

        System.out.println("Roll No=" + roll_no);
        System.out.println("Name=" + name);
    }

    CountObject(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;

        System.out.println("Roll No=" + roll_no);
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }

}

class Test1 {
    public static void main(String[] args) {
        CountObject countObject = new CountObject();
        CountObject countObject1 = new CountObject(14, "Kunal");
        CountObject countObject2 = new CountObject(50, "Pratik", 21);

        System.out.println("Total Objects in the Program are=" + CountObject.count);

    }
}