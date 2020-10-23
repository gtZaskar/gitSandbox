package com.home.sandbox.arrays;

public class ArrayForeach {
    public static void main(String[] args) {

    int [] numbers = new int[5];
    numbers[3]=10;
    String strings[] = new String[3];
    strings [0] ="hello";
    strings [1] ="java";
    strings [2] ="bye";
        System.out.println(strings [0]);
        System.out.println(strings [1]);

        System.out.println(numbers[3]);
        System.out.println(numbers[1]);

        System.out.println();

        for (int i = 0; i<strings.length;i++) {
            System.out.println(strings[i]);
        }

        System.out.println();

        for (String nameString : strings) {
            System.out.println(nameString);
        }

        System.out.println();

        for (int nameInt: numbers
             ) {
            System.out.println(nameInt);

            System.out.println();

        }
        char chars[] = {'s', 'b'};
        for (char nameChar: chars){
            System.out.println(nameChar);

        }

        System.out.println();

        int[] numbersOne = {1,2,3};
        int summ = 5;
        for (int nameNumbersOne: numbersOne
             ) {
            summ = summ*nameNumbersOne;


        }
        System.out.println(summ);

        System.out.println();

        int value = 0;
        String s = null;

        System.out.println(value);
        System.out.println(s);




        }

            
        }

