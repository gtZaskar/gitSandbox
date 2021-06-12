package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAuto;

public class MitsubishiLancerEvo extends Vehicle {
    private String name;
    private double accelerateFrom0to100;
    private static String modelNumber = "VI";

    public MitsubishiLancerEvo(int maxSpeed, String name, String modelNumber, double accelerateFrom0to100) {
        super(maxSpeed);
        this.name = name;
        this.modelNumber=modelNumber;
        this.accelerateFrom0to100 = accelerateFrom0to100;
    }

    @Override
    void acceleration() {
        System.out.println("Mitsubishi Lancer EvoVI is accelerate From 0 to 100 km/h for " + this.accelerateFrom0to100+ " sec");
    }

    public static String model(Vehicle vehicle){
        return modelNumber;

    }
    public static void model(){
        System.out.println("VI");

    }
}
