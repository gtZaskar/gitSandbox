package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap*minivan.mpg;
        System.out.println("minivan can carry " + minivan.passengers +
                " passengers on distance " + range + " miles");
    }
}
