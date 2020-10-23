package com.home.sandbox.arrays;

public class ThreeMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        for (int i =0; i<threeD.length;i++){
            for (int j=0;j<threeD[i].length;j++){
                for (int k=0; k<5;k++){
                    threeD[i][j][k] = i*j*k;
                }
            }
        }
        for (int i =0; i<threeD.length;i++){
            for (int j=0;j<threeD[i].length;j++){
                for (int k=0; k<5;k++){
                    System.out.print(threeD[i][j][k] + "  ");

                }
                System.out.println();
            }

            System.out.println();
        }


    }

}


