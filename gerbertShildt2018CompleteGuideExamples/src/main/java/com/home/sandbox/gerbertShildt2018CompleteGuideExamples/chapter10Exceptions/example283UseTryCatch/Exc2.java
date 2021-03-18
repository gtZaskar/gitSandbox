package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example283UseTryCatch;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("this dont wright ");
        } catch (ArithmeticException e) {
            System.out.println("divider by zero ");
        }
        System.out.println("after operator catch ");
    }
}
