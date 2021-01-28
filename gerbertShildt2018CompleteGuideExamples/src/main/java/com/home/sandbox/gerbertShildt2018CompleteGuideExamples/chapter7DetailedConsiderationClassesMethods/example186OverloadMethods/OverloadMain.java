package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example186OverloadMethods;

public class OverloadMain {
    public static void main(String[] args) {
        OverloadMethodsDemo overloadMethodsDemo = new OverloadMethodsDemo();
        double result;

        overloadMethodsDemo.test();
        overloadMethodsDemo.test(5);
        overloadMethodsDemo.test(5, 2);
        result=overloadMethodsDemo.test(5.5);

        System.out.println("result overloadMethodsDemo.test(5.5) : " +result);

    }
}
