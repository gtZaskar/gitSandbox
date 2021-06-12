package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter11Threads.example312ExtendedClassThread;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); //create a new thread execution
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("The main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main thread is interrupted");
        }
        System.out.println("The main thread is ended");
    }
}
