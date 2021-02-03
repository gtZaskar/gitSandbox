package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example236MethodsOverriding;

public class OverrideMain {
    public static void main(String[] args) {
        B subOb1 = new B(1,2,3);
        A subOb2 = new A(4,5);
            subOb1.show();
            subOb2.show();
        System.out.println("**********");

            subOb1.show("this k : ");
            subOb1.show();
        }
    }

