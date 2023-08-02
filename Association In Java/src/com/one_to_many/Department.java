package com.one_to_many;

// Target Class
public class Department {

    // Has-A Relationship Varaible.
    Employee employee[];
    // instance variable
    private int deptid;
    private String deptname;

    // Performing Constructor Injection
    public Department(int deptid, String deptname, Employee[] employee) {
        this.deptid = deptid;
        this.deptname = deptname;

        // Has-A relationship variable through Constructor Injection
        this.employee = employee;
    }

    void display() {

        System.out.println("***********-Employee Detials-*************");
        for (Employee employees : employee) {
            System.out.println("Employee ID:" + employees.getEid());
            System.out.println("Employee Name:" + employees.getEname());
        }

        System.out.println("**********-Department Detials-*************");
        System.out.println("Department ID:" + deptid);
        System.out.println("Department Name:" + deptname);
    }
}
