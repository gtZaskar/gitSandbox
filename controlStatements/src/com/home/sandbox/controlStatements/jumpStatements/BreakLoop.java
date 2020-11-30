package com.home.sandbox.controlStatements.jumpStatements;

public class BreakLoop { //page 156
    public static void main(String[] args) {
        for (int i =0;i<100;i++){
            if (i==10) break;
            System.out.println("i : " + i);

        }
        System.out.println("cycle is break");
    }
}
