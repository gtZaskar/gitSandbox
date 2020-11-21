package com.home.sandbox.controlStatements;

public class ForEachExample {
    public static void main(String[] args) { //page 150
        int nums [] = {1,2,3,4,5,6,7,8,9,10};
        int num =0;

        for (int numbers : nums){
            num +=numbers;
            System.out.println(numbers);
        }
        System.out.println("summ " +num);
    }
}
