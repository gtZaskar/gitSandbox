package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example191Foreach;

import java.util.Arrays;

public class ForeachTwoDArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        //enter some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(nums));

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("value " + y );
                sum += y;
            }
        }
        System.out.println("sum equal " + sum);
    }
}
