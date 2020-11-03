package com.home.sandbox.operations;

public class TernaryOperator { //page128
    public static void main(String[] args) {
        int i,k;

        i=10;
        k=i<0?-i:i;

        System.out.println("absolute value");
        System.out.println(i+ " equal " + k);

        i=-10;
        k=i<0?-i:i;

        System.out.println();
        System.out.println("absolute value");
        System.out.println(i+ " equal " + k);
    }
}
