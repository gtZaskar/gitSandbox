package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter11Threads.example314CreatingManyTreadsOfExecution;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Second");
        new NewThread("Third");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("main thread is interrupted");
        }
        System.out.println("main thread is ended");
    }
}
