package com.home.sandbox.javaRushExamples.extendsClasses.exampleCars;

public class Main {
    public static void main(String[] args) {
        Car car =new Car("some car", 500,2021,
                45,1200);
        Truck volvo = new Truck("FH",180,2018,
                1000,5000);
        Sedan skoda = new Sedan("Oktavia", 220,2008,
                56,1600);
        F1 mclaren = new F1("MCL35", 386,2020,
                200,700,"Hamilton");
        volvo.brake();
        skoda.gas();
        mclaren.pitStop();

        System.out.println(volvo instanceof Car);
        System.out.println(car instanceof Truck);
        System.out.println(car instanceof Object && volvo instanceof Object);

        System.out.println(mclaren.getMaxSpeed());
        System.out.println(mclaren.getPilot());
        mclaren.setPilot("Shumaher");
        System.out.println(mclaren.getPilot());
        mclaren.setPilot("Alonso");
        System.out.println(mclaren.getPilot());
    }
}
