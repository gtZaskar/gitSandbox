package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter11Threads.example312ExtendedClassThread;

//create a second tread execution, extends class Thread
public class NewThread  extends Thread{

    NewThread () {
        //create a new second thread execution
       super( "demonstration thread");
        System.out.println("child thread is created: " + this);
        start();//start the thread execution
    }

    //the dot an entrance in second thread execution
    public void run(){
        try {
            for (int i=5; i>0; i--){
                System.out.println("child thread : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("child thread is interrupted");
        }
        System.out.println("child thread id ended");

    }
}

