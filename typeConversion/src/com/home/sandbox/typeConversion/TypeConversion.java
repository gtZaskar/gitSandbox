package com.home.sandbox.typeConversion;

public class TypeConversion { //page96
    public static void main(String[] args) {
        byte b;
        int i =257;
        double d = 323.142;

        System.out.println("\nType conversion from int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b );

        System.out.println("\nType conversion from double to int.");
        i= (int) d;
        System.out.println("d and i " + d + " "+i);

        System.out.println("\nType conversion from double to byte.");
        b=(byte) d;
        System.out.println("d and b " + d+ " " + b);
       /* byte b =  63;
        b = (byte) (b * 2) ;
        System.out.println(b);*/
        System.out.println(b +"     "+ i +"     "+ d);
    }
}
