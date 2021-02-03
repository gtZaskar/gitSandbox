package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example232createMultilevelHierarchy;

public class DemoShipmentMain {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        double vol;
        vol = shipment1.countVolume();
        System.out.println("volume shipment1 equal : " +vol);
        System.out.println("weight shipment1 equal : " + shipment1.weight);
        System.out.println("costs shipment1 equal : " + shipment1.cost);
        System.out.println();
        vol = shipment2.countVolume();
        System.out.println("volume shipment2 equal : " +vol);
        System.out.println("weight shipment2 equal : " + shipment2.weight);
        System.out.println("costs shipment2 equal : " + shipment2.cost);

    }
}
