package com.home.sandbox.arrays;

public class TwoDArrayAgain { //page104
    public static void main(String[] args) {
        int twoD [][] = new int[4][];
        twoD [0] = new int[1];
        twoD [1] = new int[2];
        twoD [2] = new int[3];
        twoD [3] = new int[4];
        int i,j,k = 0;

       for (i=0; i<twoD.length; i++){
           for (j =0; j<twoD[i].length;j++){
               twoD[i][j] =k;
               k++;
           }

       }
        for (i=0; i<twoD.length; i++){
            for (j =0; j<twoD[i].length;j++){
        System.out.print(twoD[i][j]+ "  ");
    }
            System.out.println();
}}}
