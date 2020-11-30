package com.home.sandbox.controlStatements.jumpStatements;

public class BreakLoop2 { //page 156
    public static void main(String[] args) {
        int i =0;
        while (i<100){
           if (i==10) break;
            System.out.println("i : " +i);
            i++;
           }
        System.out.println("cycle is break");
        }
    }

