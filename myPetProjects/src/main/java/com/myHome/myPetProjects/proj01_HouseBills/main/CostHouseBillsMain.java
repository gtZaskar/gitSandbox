package main.java.com.myHome.myPetProjects.proj01_HouseBills.main;

import main.java.com.myHome.myPetProjects.proj01_HouseBills.entities.Electricity;

public class CostHouseBillsMain {
    public static void main(String[] args) {
        Electricity subscriber = new Electricity(120, 100);
        System.out.println(subscriber.costService());
        //subscriber.hashCode()
        System.out.println(subscriber);

//        electricity.setCurrentValue(120);
//        electricity.setPreviousValue(0);
//        System.out.println(electricity);
//        System.out.println(electricity.costService());
    }
}
