package com.home.sandbox.javaRushExamples.extendsClasses.exampleCars;

public class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;
    private double fuelTankVolume;
    private double weight;

    public Car(String model, int maxSpeed, int yearOfManufacture,
               double fuelTankVolume, double weight) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.fuelTankVolume = fuelTankVolume;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(double fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void gas() {
        System.out.println("gas");
    }

    public void brake() {
        System.out.println("break");

    }
}
