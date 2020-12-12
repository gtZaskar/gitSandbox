package com.home.sandbox.classes.box.box7;

public class BoxDemo7 {//page 179

    public static void main(String[] args) {
        Box mybox1 =new Box(10,20,15);
        Box mybox2 =new Box(3,6,9);
        Box mybox3 =new Box(58,56,39);

        System.out.println("volume equal : " + mybox1.volume());
        System.out.println("volume equal : " + mybox2.volume());
        System.out.println("volume equal : " + mybox3.volume());

    }
}
