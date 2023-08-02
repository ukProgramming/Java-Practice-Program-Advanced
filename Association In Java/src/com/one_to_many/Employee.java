package com.one_to_many;

// Dependent Class
public class Employee {
    // Instance variable
    private int eid;
    private String ename;


    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }
}
