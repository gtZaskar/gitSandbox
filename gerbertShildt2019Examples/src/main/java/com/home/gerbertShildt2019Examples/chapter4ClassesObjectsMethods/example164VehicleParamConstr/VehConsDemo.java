package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example164VehicleParamConstr;

public class VehConsDemo {
    public static void main(String[] args) {

        // Завершение создания объектов транспортных средств
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int distance =252;

        gallons = minivan.fuelneeded(distance);

        System.out.println("for overcoming " + distance +
                " miles on minivan needed " + gallons + " gallons fuel");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("for overcoming " + distance +
                " miles on sportscar needed " + gallons + " gallons fuel");
    }
}
