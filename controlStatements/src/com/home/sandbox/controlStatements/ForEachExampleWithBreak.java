package com.home.sandbox.controlStatements;

public class ForEachExampleWithBreak {//page 151
    public static void main(String[] args) {
        int sum =0;
        int nums []={1,2,3,4,5,6,7,8,9,10};
        for (int numbers:nums){
            System.out.println("value equal: "+numbers);
            sum+= numbers;
            if (numbers==5) break;
        }
        System.out.println("summ the first five values equal: " + sum);

    }
}
