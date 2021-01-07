package com.home.sandbox.javaRushExamples.arraysExamples.multidimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] myArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + myArray[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(myArray));

        System.out.println(myArray.length); // quantity lines
        System.out.println(myArray[0].length); // quantity elements in line [0]

    }
}
