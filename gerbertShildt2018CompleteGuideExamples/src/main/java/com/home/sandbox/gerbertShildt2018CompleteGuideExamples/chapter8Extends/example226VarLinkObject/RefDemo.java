package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example226VarLinkObject;

import main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example224PracticalExtends.Box;
import main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example224PracticalExtends.BoxWeight;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("volume of weightbox equal : " + vol);
        System.out.println("weight of weightbox equal : " + weightbox.weight);
        System.out.println();
        //*****************************
        plainbox = weightbox;
        vol = plainbox.volume();

        System.out.println("volume of plainbox equal : " + vol);


    }
}
