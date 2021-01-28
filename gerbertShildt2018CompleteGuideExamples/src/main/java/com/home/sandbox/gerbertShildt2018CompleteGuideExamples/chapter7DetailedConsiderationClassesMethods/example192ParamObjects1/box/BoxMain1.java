package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example192ParamObjects1.box;

public class BoxMain1 {//page 192

    public static void main(String[] args) {
        Box mybox1 =new Box(10,20,15);
        Box mybox2 =new Box();
        Box myCube =new Box(7);

        Box myClone = new Box(mybox1);
        double vol;

        vol=mybox1.volume();
        System.out.println("volume equal : " +vol );
        vol= mybox2.volume();
        System.out.println("volume equal : " + vol);
        vol=myCube.volume();
        System.out.println("volume equal : " + vol);
        vol=myClone.volume();
        System.out.println("volume equal : " + vol);

    }
}
