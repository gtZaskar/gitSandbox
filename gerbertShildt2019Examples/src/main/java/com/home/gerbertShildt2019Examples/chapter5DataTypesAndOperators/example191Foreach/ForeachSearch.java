package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example191Foreach;

public class ForeachSearch {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int number : nums) {
            if (number==val){
                found=true;
                break;
            }

        }
        if (found){
            System.out.println("the number 5 is found ");
        }else {
            System.out.println("the number 5 is not found ");
        }
    }
}
