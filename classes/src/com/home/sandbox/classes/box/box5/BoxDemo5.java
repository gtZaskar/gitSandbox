package com.home.sandbox.classes.box.box5;

public class BoxDemo5 { //page 176
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();
        double vol;

        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        mybox3.setDim(528,45,4);

        vol= mybox1.volume();
        System.out.println("volume equal : " + vol);

        vol= mybox2.volume();
        System.out.println("volume equal : " + vol);

        System.out.println("volume equal : " + mybox3.volume());


    }
}
