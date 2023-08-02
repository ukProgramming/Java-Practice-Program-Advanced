package com.one_to_one;

public class Driver {
    public static void main(String[] args) {
        Student student = new Student(12, "Utkrash", 20, "Male");

        Address address = new Address(101, 422210, "Maharshtra", "INDIA", "Nashik", student);

        address.display();
    }
}
