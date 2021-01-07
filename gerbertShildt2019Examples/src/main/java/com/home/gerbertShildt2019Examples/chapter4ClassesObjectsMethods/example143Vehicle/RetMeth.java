package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class RetMeth {
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

        range1= minivan.range();
        range2 =  sportscar.range();

        System.out.println("minivan can carry " + minivan.passengers +
                " passengers on distance " + range1 + " miles");
        System.out.println("sportscar can carry " + sportscar.passengers +
                " passengers on distance " + range2 + " miles");

        System.out.println("****************");
        System.out.println("minivan can carry " + minivan.passengers +
                " passengers on distance " + minivan.range() + " miles");
        System.out.println("sportscar can carry " + sportscar.passengers +
                " passengers on distance " +sportscar.range() + " miles");
        if (minivan.range()>sportscar.range()){
            System.out.println("minivan range > sportscar.range");
        }

    }
}
