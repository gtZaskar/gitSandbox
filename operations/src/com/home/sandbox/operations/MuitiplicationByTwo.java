package com.home.sandbox.operations;

public class MuitiplicationByTwo { //page119
    public static void main(String[] args) {
        int num = 0xFFFFFFF;

        for (int i =0;i<4;i++){
            num = num<<1;
            System.out.println(num);
        }
    }
}
