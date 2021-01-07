package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class AddMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers =2;
        sportscar.fuelcap = 14;
        sportscar.mpg=12;

        System.out.print("minivan can carry " + minivan.passengers +
                " passengers on " );
        minivan.range();
        System.out.print("sportscar can carry " + sportscar.passengers +
                " passengers on ");
        sportscar.range();
    }
}
