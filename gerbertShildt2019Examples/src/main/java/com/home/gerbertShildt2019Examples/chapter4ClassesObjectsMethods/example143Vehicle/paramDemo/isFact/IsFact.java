package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle.paramDemo.isFact;

public class IsFact {
    public static void main(String[] args) {
        Factor factor = new Factor();
        if (factor.isFactor(2, 6)) {
            System.out.println(" 2 is divider");
        }
        if (factor.isFactor(6, 4)) {
            System.out.println(" 6 is divider");
        }
    }
}
