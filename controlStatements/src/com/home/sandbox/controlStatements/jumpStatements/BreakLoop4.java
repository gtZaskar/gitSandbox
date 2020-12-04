package com.home.sandbox.controlStatements.jumpStatements;

public class BreakLoop4 { //page 159
    public static void main(String[] args) {
        outer:
        for (int i =0; i<3; i++){
            System.out.print("iteration "+ i + " : ");
            for (int j =0 ; j<100;j++){
                if (j==10) break outer;
                System.out.print(j +" ");
            }
            System.out.println("this string do not write");
        }
        System.out.println("cycles are ended");

    }
}
