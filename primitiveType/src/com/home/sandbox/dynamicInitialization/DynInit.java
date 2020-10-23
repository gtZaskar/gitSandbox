package com.home.sandbox.dynamicInitialization;

public class DynInit {
    public static void main(String[] args) {
        double a=3.0, b=4.0;

        //dynamic initialization variable c

        double c= Math.sqrt(a*a+b*b);
        System.out.println("hypotenuse equal " + c);
    }
}
