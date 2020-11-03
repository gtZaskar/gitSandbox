package com.home.sandbox.operations;

public class ByteShift { //page119
    public static void main(String[] args) {
        byte a=64 /*0100 0000*/ , b;
        int i;
        i=a<<2; /*1 0000 0000*/
        b = (byte) (a<<2);
        System.out.println("first value a = " + a );
        System.out.println("i and b : = " + i+ " "+ b );

    }
}
