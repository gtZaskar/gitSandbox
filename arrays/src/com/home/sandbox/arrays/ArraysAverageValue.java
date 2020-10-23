package com.home.sandbox.arrays;

public class ArraysAverageValue {
    public static void main(String[] args) {
        double array [] = {10.1, 11.2, 12.3, 13.4, 14.5} ;
        double result = 0;
        for (int i =0; i< 5; i++){
            result = result+array[i];}
            System.out.println("average value of array equal: " + (double) result/5);


    }
}
