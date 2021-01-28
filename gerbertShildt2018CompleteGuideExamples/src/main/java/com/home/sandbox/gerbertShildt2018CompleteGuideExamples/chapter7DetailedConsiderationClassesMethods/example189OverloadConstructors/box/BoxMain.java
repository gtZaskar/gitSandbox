package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example189OverloadConstructors.box;

public class BoxMain {//page 179

    public static void main(String[] args) {
        Box mybox1 =new Box(10,20,15);
        Box mybox2 =new Box();
        Box mybox3 =new Box(5);


        System.out.println("volume equal : " + mybox1.volume());
        System.out.println("volume equal : " + mybox2.volume());
        System.out.println("volume equal : " + mybox3.volume());

    }
}
