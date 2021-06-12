package main.java.com.myHome.myPetProjects.proj01_HouseBills.entities;

import main.java.com.myHome.myPetProjects.proj01_HouseBills.interfaces.CostCount;
import java.util.Date;

public class Electricity implements CostCount {
    private final double costKW = 1.68;
    private int currentValue;
    private int previousValue;



    public Electricity(int currentValue, int previousValue) {
        this.currentValue = currentValue;
        this.previousValue = previousValue;

    }



    //    public void setCurrentValue(int currentValue) {
//        this.currentValue = currentValue;
//    }
//
//    public void setPreviousValue(int previousValue) {
//        this.previousValue = previousValue;
//    }

    @Override
    public double costService() {
       System.out.println("electricity bill for " + (currentValue-previousValue) + " kW is ");
        return (currentValue - previousValue) * costKW;

    }

    @Override
    public String toString() {
        return "Electricity{" +
                "costKW=" + costKW +
                ", currentValue=" + currentValue +
                ", previousValue=" + previousValue +
                '}';
    }
}
