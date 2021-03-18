package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example261InterfacesRealisation;

public class Client implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("Method callback(), " + " called with value " + param);
    }
    void nonFaceMeth(){
        System.out.println("In classes, implementing interfaces, " +
                " can be defined and other members ");
    }
}
