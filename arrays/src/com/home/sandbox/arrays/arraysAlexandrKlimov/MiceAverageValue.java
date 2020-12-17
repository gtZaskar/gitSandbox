package com.home.sandbox.arrays.arraysAlexandrKlimov;

public class MiceAverageValue {
    public static void main(String[] args) {
        int [] mice ={2,4,6,8,10,12,14};
        int averageValue=0;

        for (int i =0;i < mice.length;i++){
            averageValue=averageValue+mice[i];
        }
        averageValue=averageValue/ mice.length;
        System.out.println(averageValue);
    }
}
