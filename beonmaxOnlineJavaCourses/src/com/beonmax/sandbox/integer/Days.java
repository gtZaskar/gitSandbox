package com.beonmax.sandbox.integer;

public class Days {
    public static void main(String[] args) {
        int days =427;
        int years = days/365;
        int month = (days%365)/31;
        int leftDays = days - years *365 - month*31;
        System.out.println("days = " + days);
        System.out.println("years = " + years);
        System.out.println("month = " + month);
        System.out.println("day =" + leftDays);
    }
}
