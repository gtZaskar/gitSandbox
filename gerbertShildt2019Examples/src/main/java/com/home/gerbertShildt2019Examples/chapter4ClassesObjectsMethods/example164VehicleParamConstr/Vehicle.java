package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example164VehicleParamConstr;

public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;

    Vehicle(int passenger1, int fuelcap1, int mpg1){
        passenger = passenger1;
        fuelcap=fuelcap1;
        mpg=mpg1;
    }
    // Определение дальности поездки транспортного средства
    int range (){
        return mpg*fuelcap;
    }
    // Расчет объема топлива , необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded (int miles){
        return (double) miles/mpg;
     }

}
