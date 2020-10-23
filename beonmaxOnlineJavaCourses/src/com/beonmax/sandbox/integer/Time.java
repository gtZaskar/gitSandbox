package com.beonmax.sandbox.integer;

public class Time {
    public static void main(String[] args) {
        int second = 1000000;
        int days = second/86400;
        int hours = (second%86400)/3600;
        int minutes = ((second%86400)%3600)/60;
        int leftSeconds = second - days*86400 - hours*3600 - minutes*60;
        System.out.println("second = " + second);
        System.out.println("days = " + days);
        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + leftSeconds);
    }
}
