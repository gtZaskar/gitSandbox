package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.exampleMyVehicle;

public class Vehicle {
    int passenger;
    int fuelTank;
    int averageSpeed;
    int fuelConsumptionLiterFor100Km;
    int weight;

    //constructor
    Vehicle(int pass, int fT, int aS, int fCLFK, int w) {
        this.passenger = pass;
        this.fuelTank = fT;
        this.averageSpeed = aS;
        this.fuelConsumptionLiterFor100Km = fCLFK;
        this.weight = w;
    }

    // method: how distance ride the Vehicle on full fuel tank
    double range() {

        return (double) (this.fuelTank * 100) / fuelConsumptionLiterFor100Km;
    }

    // method: how many fuel needed for ride given distance
    double fuelNeeded(int distance) {
        return ( double) (distance*fuelConsumptionLiterFor100Km)/100;
    }
    //method: how costs ride needed distance
    double distCost(int distance, double fuelCostsForOneLitre){
        return (double) ((distance*fuelConsumptionLiterFor100Km)/100)*fuelCostsForOneLitre;
    }
    //method: how many time needed for ride given distance
    double timeDist(int distance){
        return (double) distance/(this.averageSpeed);
    }
}
