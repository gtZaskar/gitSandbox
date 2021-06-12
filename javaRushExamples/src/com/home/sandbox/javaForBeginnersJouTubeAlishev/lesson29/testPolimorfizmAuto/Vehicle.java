package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAuto;

public class Vehicle {
    private int maxSpeed;
    private static int count;

    public Vehicle(int maxSpeed){
      this.maxSpeed=maxSpeed;
        count++;
    }

    public Vehicle() {

    }

    static void counter(){
        System.out.println(count);
    }

    void goAhead (){
        System.out.println("vehicle is go ahead");
    }
    void acceleration (){
        System.out.println("vehicle is accelerate");
    }
}
