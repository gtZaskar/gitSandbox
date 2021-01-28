package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example187OverloadMethods;

public class OverloadMethodsDemo1 {
    void test() {
        System.out.println("No Parameters ");
    }

    void test(int a, int b) {
        System.out.println("method have parameters a and b, which equal " + a + " and " + b);
    }

    void test(double a) {
        System.out.println("inside transformation when call " + " test (double) a : " + a);
    }
}


