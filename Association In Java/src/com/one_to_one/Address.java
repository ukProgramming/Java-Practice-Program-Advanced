package com.one_to_one;

public class Address {
    Student student;
    private int doorno;
    private int pincode;
    private String state;
    private String country;
    private String city;

    public Address(int doorno, int pincode, String state, String country, String city, Student student) {
        this.doorno = doorno;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
        this.city = city;
        this.student = student;
    }


    public void display() {
        System.out.println("***********Student Details:***********");
        System.out.println("Student ID:" + student.getSid());
        System.out.println("Student Name:" + student.getSname());
        System.out.println("Student Age:" + student.getSage());
        System.out.println("Student Gender:" + student.getSgender());


        System.out.println("***********Address Details:***********");
        System.out.println("Door No:" + doorno);
        System.out.println("Pincode:" + pincode);
        System.out.println("State:" + state);
        System.out.println("Country:" + country);
        System.out.println("City:" + city);
    }

}
