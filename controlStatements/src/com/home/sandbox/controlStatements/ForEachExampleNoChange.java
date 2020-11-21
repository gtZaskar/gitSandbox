package com.home.sandbox.controlStatements;

public class ForEachExampleNoChange {
    public static void main(String[] args) {
        int nums []={1,2,3,4,5,6,7,8,9,10};
        for (int numbers:nums
             ) {
            System.out.print(numbers+" ");
            numbers = numbers*10;
        }
        System.out.println();

        for (int numbers:nums
             ) {
            System.out.print(numbers +" ");

        }

    }
}
