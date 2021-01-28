package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example186OverloadMethods;

public class OverloadMethodsDemo {
    void test() {
        System.out.println("No Parameters ");
    }

    void test(int a) {
        System.out.println("method have parameter a, which equal " + a);
    }

    void test(int a, int b) {
        System.out.println("method have parameters a and b, which equal " + a + " and " + b);
    }

    double test(double a) {
        System.out.println("method have double parameter a, which equal " + a);
        return a * a;

    }

}
