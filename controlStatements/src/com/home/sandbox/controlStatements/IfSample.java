package com.home.sandbox.controlStatements;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y)
            System.out.println("x smaller y");
        x = x * 2;
        if (x == y)
            System.out.println("x equal y");
        x = x * 2;
        if (x > y)
            System.out.println("x more y");
        if (x == y)
            System.out.println("you dont see this");

    }
}
