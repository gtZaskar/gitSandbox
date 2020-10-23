package com.home.sandbox.booleanDemo;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
      b=false;
        System.out.println("b equal " + b);
        b= true;
        System.out.println("b equal " + b);
        if (b) System.out.println("this code performing");

        if (b==false) System.out.println("this code not performing");

        System.out.println("10>9 equal " + (10>9));
    }
}
