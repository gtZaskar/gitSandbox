package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example194ArgumentsTransfer.callByValue;

public class CallByValueMain {
    public static void main(String[] args) {
        Test ob =new Test();

        int a =15, b = 20;

        System.out.println("a and b before call : " + a + " " + b);

        ob.meth(a,b);
        System.out.println("a and b after call : " + a + " " + b);
    }
}
