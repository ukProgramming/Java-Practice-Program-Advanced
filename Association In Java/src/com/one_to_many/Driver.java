package com.one_to_many;

public class Driver {
    public static void main(String[] args) {
        Employee employee[] = new Employee[2];
        Employee employee1 = new Employee(102, "Kunal");
        Employee employee2 = new Employee(103, "Swapnil");
        employee[0] = employee1;
        employee[1] = employee2;


        Department department = new Department(201, "Civil", employee);

        department.display();
    }
}
