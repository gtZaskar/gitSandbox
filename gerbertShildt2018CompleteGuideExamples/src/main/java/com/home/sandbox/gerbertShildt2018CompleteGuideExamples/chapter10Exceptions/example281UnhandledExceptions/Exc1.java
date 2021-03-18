package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example281UnhandledExceptions;

public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 42 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}