package com.home.sandbox.controlStatements.jumpStatements;

public class BreakGoto { //page 158
    public static void main(String[] args) {
        boolean t =true;

        first: {
            second:{
            third:{
                System.out.println("Preceded to operator break");
                if (t) break second;
                System.out.println("this operator do not work 1");
            }
                System.out.println("this operator do not work 2");
            }
            System.out.println("this operator follow behind the block second");
        }
    }
}
