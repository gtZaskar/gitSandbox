package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example191ParamObjects;

public class PassObjectMain {
    public static void main(String[] args) {
        Test ob1 =new Test(100,22);
        Test ob2 =new Test(100,22);
        Test ob3 =new Test(-1,-1);
        Test ob4 =ob2;


        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
        System.out.println("ob1 == ob4: " + ob1.equalTo(ob4));
    }
}
