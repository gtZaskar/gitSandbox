package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example191Foreach;

public class ForeachSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int forSum = 0;
        int foreachSum = 0;
        int foreachSumBreak = 0;

        for (int i = 0; i < arr.length; i++) {
            forSum += arr[i];
        }
        System.out.println("forSum = " + forSum);

        for (int numbers : arr) {
            foreachSum += numbers;
        }
        System.out.println("foreachSum = " + foreachSum);

        for (int numbers : arr) {
            foreachSumBreak += numbers;
            if (numbers == 5) break;
        }
        System.out.println("foreachSumBreak = " + foreachSumBreak);

        for (int numbers : arr) {
            System.out.print(numbers + " ");
            numbers = numbers * 10;

        }
        System.out.println();
        for (int numbers : arr) {
            System.out.print(numbers + " ");
            numbers = numbers;

        }
    }
}
