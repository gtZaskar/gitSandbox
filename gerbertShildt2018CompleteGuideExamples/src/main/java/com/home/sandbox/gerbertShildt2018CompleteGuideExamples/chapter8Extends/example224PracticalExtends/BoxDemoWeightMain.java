package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example224PracticalExtends;

public class BoxDemoWeightMain {//page 225

    public static void main(String[] args) {
        Box mybox1 =new Box(10,20,30);
        Box mybox2 =new Box(3,6,9);
        Box mybox3 =new Box(58,56,39);
        //******************************************
        BoxWeight mybox4 = new BoxWeight(10,20,15,34.4);
        Box mybox5 = new Box(11);
        Box mybox6 = new Box(mybox5);
        BoxWeight mybox7 = new BoxWeight(2,3,4,0.076);
        Box mybox9 = new Box();
        double vol;
        //*****************************************
        ColorBox mybox8  =new ColorBox("white");


        System.out.println("volume equal : " + mybox1.volume());
        System.out.println("volume equal : " + mybox2.volume());
        System.out.println("volume equal : " + mybox3.volume());
        System.out.println("*****************");
        //********************************************
        vol= mybox4.volume();
        System.out.print("value mybox4 equal :" + vol);
        System.out.println();
        System.out.println("weight mybox4 equal :" + mybox4.weight);
        System.out.println();
        //********************************************
        vol= mybox6.volume();
        System.out.print("value mybox6 equal :" + vol);
        System.out.println();
        System.out.println("weight mybox6 equal :" + " is null");
        System.out.println();
        //********************************************
        vol=mybox7.volume();
        System.out.print("value mybox7 equal :" + vol);
        System.out.println();
        System.out.println("weight mybox7 equal :" + mybox7.weight);
        System.out.println();
        //********************************************
        System.out.println("the color of mybox8 is : " + mybox8.color);
        vol=mybox9.volume();
        System.out.println("empty box :" +vol );
    }
}
