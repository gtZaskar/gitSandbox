package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example228KeyWordSuper.anotherUseSuper;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("member i in superCass == " + super.i);
        System.out.println("member i in subCass == " + i);
    }

}
