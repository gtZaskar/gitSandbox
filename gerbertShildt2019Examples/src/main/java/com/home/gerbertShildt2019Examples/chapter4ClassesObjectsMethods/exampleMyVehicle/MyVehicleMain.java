package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.exampleMyVehicle;

public class MyVehicleMain {
    public static void main(String[] args) {
        int distance = 1300;
        Vehicle vWCrossPolo = new Vehicle(5,45,100,6,1600);
        Vehicle zaz968M = new Vehicle(4,40,80,8,860);
        Vehicle gtZaskar = new Vehicle(1,0,20,0,11);

        vWCrossPolo.range();
        zaz968M.range();
        gtZaskar.range();


        System.out.println("vw cross polo can ride the distance " + vWCrossPolo.range() +
                " km, on full fuel tank, witch equal " + vWCrossPolo.fuelTank + " litres");

        System.out.println("zaz 968 M can ride the distance " + zaz968M.range() +
                " km, on full fuel tank, witch equal " + zaz968M.fuelTank + " litres");

        System.out.println("gt zaskar can ride the distance " + gtZaskar.range() +
                " km, on full fuel tank, witch equal " + gtZaskar.fuelTank + " litres");

        System.out.println("*********************************************");

        vWCrossPolo.fuelNeeded(distance);

        System.out.println("vw cross polo for ride distance " + distance + " km, needed fuel " +
                vWCrossPolo.fuelNeeded(distance) + " litres and costs this :" +
                vWCrossPolo.distCost(distance,28.50) + " UAH");

        System.out.println("zaz 968 M for ride distance " + distance + " km, needed fuel  " +
                zaz968M.fuelNeeded(distance) + " litres  and costs this :" +
                zaz968M.distCost(distance,22.5) + " UAH");

        System.out.println("gt zaskar for ride distance " + distance + " km, needed fuel " +
                gtZaskar.fuelNeeded(distance) + " litres  and costs this :" +
                gtZaskar.distCost(distance,0)+ " UAH");

        System.out.println("*********************************************");
        System.out.println("vw cross polo for ride distance " + distance +
                " with average speed equal "+ vWCrossPolo.averageSpeed +
                " km/h, needed "+ vWCrossPolo.timeDist(distance) + " hours");

        System.out.println("zaz 968 M for ride distance " + distance +
                " with average speed equal "+ zaz968M.averageSpeed +
                " km/h, needed "+ zaz968M.timeDist(distance) + " hours");

        System.out.println("gt zaskar for ride distance " + distance +
                " with average speed equal "+ gtZaskar.averageSpeed +
                " km/h, needed "+ gtZaskar.timeDist(distance) + " hours");



    }
}
