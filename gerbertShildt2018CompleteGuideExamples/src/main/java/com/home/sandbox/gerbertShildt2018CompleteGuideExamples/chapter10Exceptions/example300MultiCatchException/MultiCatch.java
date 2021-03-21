package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example300MultiCatchException;

public class MultiCatch {
    public static void main(String[] args) {
        int a=10, b=0;
        int vals[] = {1,2,3};

        try {
            //int result  =a/b;
            vals[10]=19;
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println("exception catch :" + e);
        }
        System.out.println("after many catch");
    }
}
