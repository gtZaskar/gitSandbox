package com.home.sandbox.controlStatements;

public class ForEachExampleMultidimensionalArray { //page 152
    public static void main(String[] args) {
        int sum =0;
        int nums[][] = new int[3][5];

        for (int i =0;i<3;i++)
            for (int j=0;j<5;j++)
                nums[i][j]=(i+1)*(j+1);
            for (int x []:nums){
                for (int y:x){
                    System.out.println("value equal " + y);
                    sum+=y;
                }
            }
        System.out.println("summ equal " + sum);
        
    }
}
