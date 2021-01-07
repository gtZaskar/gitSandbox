package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    /*void range (){
        System.out.println("distance "+ fuelcap*mpg + " miles");
    }*/
    int range() {
        return fuelcap * mpg;
    }
    double fuelneeded (int miles){
        return (double) miles/mpg;

    }

}
