package com.home.sandbox.arrays;

public class MultidimensionalArrays { //105
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        for (int nameNumber : number) {
            System.out.println(nameNumber);
        }

        System.out.println();

        int [][] matrix= {{1,2,3},
                          {4,5,6,89,36,95},
                          {7,8,9}};

        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][3]);

        System.out.println();

       for (int i = 0; i<matrix.length;i++){
           for (int j =0; j<matrix[i].length;j++){
               System.out.print(matrix [i] [j]+ "  ");
           }
           System.out.println();

        }

        System.out.println();

        String[][] strings = new String[2][3];
        strings [0][1]= "Hello";
        System.out.println(strings[0][1]);

        System.out.println();

        double [][] m = {{0*0,1*0,2*0,3*0},
                         {0*1,1*1,2*1,3*1},
                         {0*2,1*2,2*2,3*2},
                         {0*3,1*3,2*3,3*3}};

        for (int i =0; i<m.length;i++){
            for (int j=0;j<m[i].length; j++){
                System.out.print(m[i][j] + "  ");

            }
            System.out.println();
        }

    }
}
