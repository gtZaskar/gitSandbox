package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example204StaticDemo.userStatic;

public class UserStatic {
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println(" Static block initialization ");
        b=a*4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
