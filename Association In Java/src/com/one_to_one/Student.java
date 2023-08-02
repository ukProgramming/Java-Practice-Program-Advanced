package com.one_to_one;

public class Student {

    private int sid;
    private String sname;
    private int sage;
    private String sgender;

    public Student(int sid, String sname, int sage, String sgender) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.sgender = sgender;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSage() {
        return sage;
    }

    public String getSgender() {
        return sgender;
    }


}
