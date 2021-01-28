package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example176BubbleSort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 5, 3, 8, 8, 9, 1, 6, 6, 9, 5, 3, 8, 7, 4, 6, 9, 10, 0};

        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    int num = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = num;
                }

            }
        }
        System.out.println("sorted array nums :");
        System.out.println(Arrays.toString(nums));
    }
}

