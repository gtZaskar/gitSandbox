package com.home.sandbox.javaCodewars.exercises.ex01;

class Kata {

    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        } else if (x == 0) {
            return 0;
        } else if (x < 0) {
            return x;
        }
        return x;
    }
}
