package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example222BasicExtends;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        C c = new C();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("consists superOb : ");
        superOb.showij();
        System.out.println("*****************");

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("consists subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println("******************");

        System.out.println("sum i, j and k in object subOb : ");
        subOb.sum();
        c.k = 256;
        c.showNum();
    }
}
