package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example261InterfacesRealisation;

public class AnotherClient implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("Another variant implements of Method callback() ");
        System.out.println(" p squared equal : " + (param*param));
    }
}
