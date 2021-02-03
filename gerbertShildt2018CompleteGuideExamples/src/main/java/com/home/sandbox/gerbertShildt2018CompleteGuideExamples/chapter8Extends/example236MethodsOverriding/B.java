package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example236MethodsOverriding;

public class B extends A {
    int k;


    B(int a, int b,int c ) {
        super(a, b);
        this.k=c;
    }
    void show (){
        super.show();
        System.out.println(" k equal " + k);
    }
    void show (String msg){
        System.out.println(msg+k);
    }
}
