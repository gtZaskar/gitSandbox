package com.home.sandbox.lightSpeed;

public class LightSpeed {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        lightSpeed = 186000; // approximate light speed mil/sec
        days = 1000; // set quantity days
        seconds = days*24*60*60; //change in seconds
        distance = lightSpeed * seconds;
        System.out.print("from " + days );
        System.out.print(" days light to walk approximate  ");
        System.out.println(distance + " mill");
    }
}
