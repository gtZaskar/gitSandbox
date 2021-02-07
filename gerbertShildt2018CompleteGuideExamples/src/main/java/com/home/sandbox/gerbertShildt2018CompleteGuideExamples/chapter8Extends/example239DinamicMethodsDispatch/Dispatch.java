package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example239DinamicMethodsDispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; //to get a link to an object A


        r=a;
        r.callme();

        r=b;
        r.callme();

        r = c;
        r.callme();

        r=a;
        r.callme();

    }
}
