package com.home.sandbox.controlStatements;

public class SwitchSampleExample { //page136
    public static void main(String[] args) {
        for (int i =0; i<6; i++){
            switch (i) {
                case 0:
                    System.out.println("i equal 0");
                    break;
                case 1:
                    System.out.println("i equal 1");
                    break;
                case 2:
                    System.out.println("i equal 2");
                    break;
                case 3:
                    System.out.println("i equal 3");
                    break;
                default:
                    System.out.println("i bigger than 3");
            }

        }
    }
}

