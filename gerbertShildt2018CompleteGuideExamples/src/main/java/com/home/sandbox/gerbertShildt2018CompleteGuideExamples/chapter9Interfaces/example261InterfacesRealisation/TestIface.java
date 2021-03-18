package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example261InterfacesRealisation;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        Client client = new Client();
    c.callback(42);
    client.callback(10);
    client.nonFaceMeth();
    }
}
