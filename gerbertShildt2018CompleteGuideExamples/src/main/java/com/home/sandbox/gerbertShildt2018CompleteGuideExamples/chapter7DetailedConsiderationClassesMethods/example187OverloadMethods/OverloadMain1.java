package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example187OverloadMethods;

public class OverloadMain1 {
    public static void main(String[] args) {
        OverloadMethodsDemo1 overloadMethodsDemo1 = new OverloadMethodsDemo1();
        int num = 88;

        overloadMethodsDemo1.test();
        overloadMethodsDemo1.test(10, 20);
        overloadMethodsDemo1.test(num);
        overloadMethodsDemo1.test(132.2);


    }
}
