package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example264NestedInterface;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)){
            System.out.println("number 10 is not negative");}
        if (nif.isNotNegative(-12)){
            System.out.println("this cannot write");
        }
    }
}
