package com.many_to_one;

// Dependent Object
public class Branch {
    private int bid;
    private String bloc;

    // Constructor Injection
    public Branch(int bid, String bloc) {
        this.bid = bid;
        this.bloc = bloc;
    }

    // Getters to get the value
    public int getBid() {
        return bid;
    }

    public String getBloc() {
        return bloc;
    }
}
