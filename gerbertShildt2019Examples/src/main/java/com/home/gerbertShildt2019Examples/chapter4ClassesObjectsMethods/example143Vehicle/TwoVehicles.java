package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers =2;
        sportscar.fuelcap = 14;
        sportscar.mpg=12;

        range1 = minivan.fuelcap*minivan.mpg;
        range2= sportscar.fuelcap* sportscar.mpg;

        System.out.println("minivan can carry " + minivan.passengers +
                " passengers on distance " + range1 + " miles");
        System.out.println("sportscar can carry " + sportscar.passengers +
                " passengers on distance " + range2 + " miles");


    }
}
