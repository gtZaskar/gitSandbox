package com.home.sandbox.circleSquare;

public class CircleSquare {
    public static void main(String[] args) {
        double circleRadius = 10.8; //mm
        double pi = 3.1416;
        double circleSquare = pi* (circleRadius*circleRadius);
        System.out.print("square of circle with radius circle " + circleRadius);
        System.out.println(" equal "+circleSquare);
    }
}
