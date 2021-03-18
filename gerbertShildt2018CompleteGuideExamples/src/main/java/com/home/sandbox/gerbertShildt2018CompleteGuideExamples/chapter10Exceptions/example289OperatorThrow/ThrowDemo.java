package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example289OperatorThrow;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("exception catch in body of method demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("replays catch " + e);
        }
    }
}
