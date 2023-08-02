package com.many_to_one;

// Target Object
public class Student {
    private int sid;
    private String sname;
    private int sage;

    // HAS-A Relation Variable
    private Branch branch;

    // Constructor Injection
    public Student(int sid, String sname, int sage, Branch branch) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.branch = branch;
    }

    public void getStudentDetails() {
        System.out.println("**********-Student Details are-**********");
        System.out.println("SID   ::" + sid);
        System.out.println("SNAME ::" + sname);
        System.out.println("SAGE  ::" + sage);
        System.out.println("-----------------------------------------");
        System.out.println("*********-Branch Details are-************");
        System.out.println("BID   ::" + branch.getBid());
        System.out.println("BLOC  ::" + branch.getBloc());

    }
}
