package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int distance = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(distance);
        System.out.println("for overcoming " + distance +
                " miles on minivan needed " + gallons + " gallons fuel");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("for overcoming " + distance +
                " miles on sportscar needed " + gallons + " gallons fuel");
    }
}
