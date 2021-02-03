package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example228KeyWordSuper.boxSuper;

public class DemoSuperMain {
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight(10,20,15,34.4);
        BoxWeight boxWeight2 = new BoxWeight(2,3,4,0.076);
        BoxWeight boxWeight3 = new BoxWeight();
        BoxWeight boxCube = new BoxWeight(3,2.5);
        BoxWeight boxClone = new BoxWeight(boxWeight1);
        double vol;

        vol = boxWeight1.volume();
        System.out.println("boxWeight1.volume() : " + vol);
        System.out.println("weight boxWeight1 == " + boxWeight1.weight);
        System.out.println();

        vol = boxWeight2.volume();
        System.out.println("boxWeight2.volume() : " + vol);
        System.out.println("weight boxWeight2 == " + boxWeight2.weight);
        System.out.println();

        vol = boxWeight3.volume();
        System.out.println("boxWeight3.volume() : " + vol);
        System.out.println("weight boxWeight3 == " + boxWeight3.weight);
        System.out.println();

        vol = boxWeight3.volume();
        System.out.println("boxWeight3.volume() : " + vol);
        System.out.println("weight boxWeight3 == " + boxWeight3.weight);
        System.out.println();

        vol = boxCube.volume();
        System.out.println("boxCube.volume() : " + vol);
        System.out.println("weight boxCube == " + boxCube.weight);
        System.out.println();

        vol = boxClone.volume();
        System.out.println("boxClone.volume() : " + vol);
        System.out.println("weight boxClone == " + boxClone.weight);
        System.out.println();



    }
}
