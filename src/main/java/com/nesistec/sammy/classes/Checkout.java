package com.nesistec.sammy.classes;

/**
 * Created by samif on 30/07/2016.
 */
public class Checkout {

    private int runningTotal;

    public void add(int count, int price){
        runningTotal += (count * price);
    }

    public int total() {
        return runningTotal;
    }
}