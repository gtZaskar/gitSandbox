package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter11Threads.example308MainThreadOfExecution;

//manage of main thread execution
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("current thread execution : " + t);

        //change thread execution name
        t.setName("My thread");
        System.out.println("after change thread name :" + t);
        try {
    for (int n = 5; n>0; n--){
        System.out.println(n);
        Thread.sleep(1000);
    }
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupt");

        }
        System.out.println(t.getName());
    }
}
