package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter6IntroductionToClasses.example165ClassBox.box4;

public class BoxDemo4 {//page 174

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;

        vol=mybox1.volume();
        System.out.println("volume equal : " + vol);
        vol=mybox2.volume();
        System.out.println("volume equal : " + vol);

        System.out.println("volume equal : " + mybox1.volume());
        System.out.println("volume equal : " +mybox2.volume());

    }
}
