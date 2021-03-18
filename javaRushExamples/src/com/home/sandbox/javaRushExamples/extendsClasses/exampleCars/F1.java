package com.home.sandbox.javaRushExamples.extendsClasses.exampleCars;

public class F1 extends Car {
    private String pilot;

    public F1(String model, int maxSpeed, int yearOfManufacture,
              double fuelTankVolume, double weight, String pilot) {
        super(model, maxSpeed, yearOfManufacture, fuelTankVolume, weight);
        this.pilot = pilot;
    }

    public void pitStop() {
        System.out.println("pit stop");
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }
}
