package com.home.sandbox.controlStatements.jumpStatements;

public class ContinueExample { // page 160
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            System.out.print(i+ " ");
            if (i%2==0) continue;
            System.out.println(" ");
        }
    }
}
