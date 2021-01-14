package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.trucks;

public class TrucksMain {
    public static void main(String[] args) {
        Truck truck1 = new Truck();
        truck1.height = 100;
        truck1.length = 26;
        truck1.width = 458;
        truck1.weight = 15000;

        Truck truck2 = new Truck();
        truck2.weight = 10247;

        BridgeOfficer colombo = new BridgeOfficer(10248);
        System.out.print("Truck1 can go? ");
        boolean canTruck1Go = colombo.checkTruck(truck1);
        if (canTruck1Go == true) {
            System.out.println("Yes!");
        } else {
            System.out.println("Not!");
        }
        System.out.print("Truck2 can go? ");
        boolean canTruck2Go = colombo.checkTruck(truck2);
        if (canTruck2Go == true) {
            System.out.println("Yes!");
        } else {
            System.out.println("Not!");
        }


        System.out.println("Truck 1 volume equal : " + truck1.getVolume());
    }
}
