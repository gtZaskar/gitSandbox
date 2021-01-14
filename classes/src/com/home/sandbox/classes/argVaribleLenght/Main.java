package com.home.sandbox.classes.argVaribleLenght;

public class Main {
    public static void main(String[] args) {
        ArgVaribleLenght maxNum = new ArgVaribleLenght();
        ArgVaribleLenght maxNum1 = new ArgVaribleLenght();
        ArgVaribleLenght maxNum2 = new ArgVaribleLenght();
        ArgVaribleLenght maxNum3 = new ArgVaribleLenght();
        System.out.println(maxNum.findMaxNumber(12.3, 47.8, 85.5, 251.30, 1.1, 3.2, 1.2, 321.5));
        System.out.println(maxNum1.findMaxNumber(252, 56, 2, 125, 15, 151, 51, 5, 15, 15, 1));
        System.out.println(maxNum2.findMaxNumber(2652, 545, 656, 1561, 51, 1, 5614.151, 88561, 15.51251, 5641.1556, 515.1514515));
        System.out.println(maxNum3.findMaxNumber(155, 515, 15, 15615.15151, 5151, 1515.2515));
        System.out.println("****************");
        ArgVaribleLenght argVaribleLenght = new ArgVaribleLenght();
        ArgVaribleLenght argVaribleLenght1 = new ArgVaribleLenght();
        System.out.println(argVaribleLenght.sumParams(25, 12, 21));
        System.out.println(argVaribleLenght1.sumParams(25, 12, 21, 145, 1451, 1414, 4, 4, 4, 45));
        System.out.println("++++++++++++++++++++");
        ArgVaribleLenght num = new ArgVaribleLenght();
        System.out.println(num.toSortArrayFloat(12.8f, 3.85f, 56.1f, 12.3f, 21.1f));

    }
}
