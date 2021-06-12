package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter11Threads.example310RealizationInterfaceRunnable;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); //create a new thread
        try {
            for (int i =5; i>0;i--){
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is ended");
    }
}
