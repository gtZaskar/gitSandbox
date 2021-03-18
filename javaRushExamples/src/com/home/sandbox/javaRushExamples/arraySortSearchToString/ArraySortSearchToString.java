package com.home.sandbox.javaRushExamples.arraySortSearchToString;

import java.util.Arrays;

public class ArraySortSearchToString {
    public static void main(String[] args) {
       int[] array = {1, 5, 4, 3, 7};

        System.out.println(array);

        System.out.println(Arrays.toString(array));

        Arrays.sort(array, 2, 4);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int key = Arrays.binarySearch(array,5);
        System.out.println(key);

        System.out.println(Arrays.binarySearch(array,7));
        System.out.println(Arrays.binarySearch(array,1100));

        System.out.println("***************gh\\");

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

       /* for (int i=numbers.length-1; i>0;i--){ // example sort
            for (int j=0;j>i;j++){
                if (numbers[j]>numbers[j]+1){
                   int tmp = numbers[j+1];
                   numbers[j] = numbers[j+1];
                   numbers[j+1]=tmp;
                }
            }

        }*/

        /*int[] numbersCopy = new int[10]; //example copy

        for (int i = 0; i < numbers.length; i++) {

            numbersCopy[i] = numbers[i];

        }
        for (int numbersCopyArray : numbersCopy) {
            System.out.println(numbersCopyArray);


        }*/

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);
        System.out.println(Arrays.toString(numbersCopy));

        int[] numbersCopy1 = Arrays.copyOfRange(numbers,0,7);
        System.out.println(Arrays.toString(numbersCopy1));

        System.out.println(Arrays.equals(numbers,numbersCopy1));

        System.out.println(Arrays.asList());



        int [][] numbers2 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] numbers2Copy = Arrays.copyOf(numbers2, numbers2.length);

        System.out.println(Arrays.deepEquals(numbers2,numbers2Copy));

        System.out.println(Arrays.deepToString(numbers2));

    }


}
