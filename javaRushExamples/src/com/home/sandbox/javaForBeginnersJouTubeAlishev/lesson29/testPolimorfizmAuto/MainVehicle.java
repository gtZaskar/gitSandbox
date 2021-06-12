package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAuto;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle1 = new MitsubishiLancerEvo(200, "EVO", "VI", 8.9);
        Vehicle vehicle2 = new SubaruImprezaVRXSTI();
        Vehicle vehicle3 = new VWGolfV(250,"VWGolfV", 9.1);
        //Vehicle vehicle4 = new Vehicle(150);
        vehicle1.acceleration();
        vehicle2.acceleration();
        vehicle3.acceleration();
        System.out.println("***********");
        allTest(vehicle1);
        allTest(vehicle2);
        allTest(vehicle3);
        System.out.println("////////////");
        System.out.println(MitsubishiLancerEvo.model(vehicle1));
        MitsubishiLancerEvo.model();
        Vehicle.counter();

    }

    public static void allTest(Vehicle vehicle) {
        vehicle.acceleration();
        vehicle.goAhead();
    }
}
