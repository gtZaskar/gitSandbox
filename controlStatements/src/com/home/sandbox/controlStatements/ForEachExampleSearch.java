package com.home.sandbox.controlStatements;

public class ForEachExampleSearch { //page 154
    public static void main(String[] args) {
        int nums [] ={6,8,3,7,5,6,1,4};
        int val = 58;
        boolean found=false;

        for (int x: nums) {
            if (x==val){
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}
