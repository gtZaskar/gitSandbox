package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAuto;

public class VWGolfV extends Vehicle{
    private String name;
    private double accelerateFrom0to100;

    public VWGolfV(){
        super();

    }

    public VWGolfV(int maxSpeed, String name, double accelerateFrom0to100) {
        super(maxSpeed);
        this.name = name;
        this.accelerateFrom0to100 = accelerateFrom0to100;
    }

    @Override
    void acceleration() {
        System.out.println("VW Golf V is accelerate From 0 to 100 km/h for " + this.accelerateFrom0to100+ " sec");
    }
}

