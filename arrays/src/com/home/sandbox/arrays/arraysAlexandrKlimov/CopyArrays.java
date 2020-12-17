package com.home.sandbox.arrays.arraysAlexandrKlimov;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        int count;
        int [] firstArray ={1,5,25};
        int[] copyFirstArray = new int[10];
        //int [] firstArray =new int[156798];
        int [] secondArray = firstArray;
        secondArray[2]=39;
               Arrays.copyOf(firstArray,copyFirstArray.length);


        System.out.println("firstArray : " + Arrays.toString(firstArray) +
                "\n secondArray : " + Arrays.toString(secondArray) +
                "\n" + secondArray[2] +
                "\n"+ Arrays.toString(copyFirstArray)+
                "\n" + Arrays.toString(firstArray));
    }
}
