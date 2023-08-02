package com.many_to_one;

// Driven Class
public class Driver {
    public static void main(String[] args) {

        Branch branch = new Branch(101, "Nashik");

        Student student = new Student(201, "Utkarsh", 20, branch);
        Student student1 = new Student(202, "Kunal", 21, branch);
        Student student2 = new Student(203, "Pratik", 22, branch);
        Student student3 = new Student(204, "Om", 19, branch);

        student.getStudentDetails();
        System.out.println();

        student1.getStudentDetails();
        System.out.println();

        student2.getStudentDetails();
        System.out.println();

        student3.getStudentDetails();
        System.out.println();

    }
}
