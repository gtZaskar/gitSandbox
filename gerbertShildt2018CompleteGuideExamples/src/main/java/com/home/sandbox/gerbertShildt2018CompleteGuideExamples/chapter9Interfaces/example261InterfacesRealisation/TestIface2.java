package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example261InterfacesRealisation;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient obj = new AnotherClient();

        c.callback(42);
        c=obj;
        c.callback(42);
    }
}
