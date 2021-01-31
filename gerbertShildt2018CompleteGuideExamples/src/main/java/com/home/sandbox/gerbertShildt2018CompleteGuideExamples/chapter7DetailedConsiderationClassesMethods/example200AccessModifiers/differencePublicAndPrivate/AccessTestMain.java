package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example200AccessModifiers.differencePublicAndPrivate;

public class AccessTestMain {
    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(obj.a=10);
        System.out.println(obj.b=20);
        obj.setC(100);
        System.out.println(obj.getC());
    }
}
