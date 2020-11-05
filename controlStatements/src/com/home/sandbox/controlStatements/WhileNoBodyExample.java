package com.home.sandbox.controlStatements;

public class WhileNoBodyExample {//page141
    public static void main(String[] args) {
        int i,j;
        i=100;
        j=200;

        while (++i<--j);
        System.out.println("middle value equal = "+i);
        System.out.println(j);
    }
}
