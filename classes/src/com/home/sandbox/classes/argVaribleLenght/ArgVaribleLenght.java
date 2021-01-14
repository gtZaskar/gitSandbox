package com.home.sandbox.classes.argVaribleLenght;

import java.util.Arrays;

public class ArgVaribleLenght {
    double findMaxNumber(double... arr) {
        double num = arr[0];
        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }

    int sumParams(int... params) {
        int sum = 0;
        if (params.length == 0) return 0;
        for (int i = 0; i < params.length; i++) {
            sum += params[i];
        }
        return sum;
    }

    float[] toSortArrayFloat(float... params) {
        float num;
        if (params.length < 2) {
            return params;
        }
        for (int i = 0; i < params.length; i++) {
            Arrays.sort(params);
        }
        return  params;
    }
}
