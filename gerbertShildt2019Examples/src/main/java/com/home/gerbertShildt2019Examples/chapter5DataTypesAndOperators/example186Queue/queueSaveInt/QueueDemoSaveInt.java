package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example186Queue.queueSaveInt;

public class QueueDemoSaveInt {
    public static void main(String[] args) {
        QueueSaveInt bigQ = new QueueSaveInt(100);
        QueueSaveInt smallQ = new QueueSaveInt(4);
        int num;
        int i;

        System.out.println("Using queue bigQ for saving alphabet ");

        for (i =0;i<26;i++) {
            bigQ.put(i);
        }

        System.out.print(" the queue bigQ consists : ");
        for (i=0;i<26;i++){
            num = bigQ.get();
            if (num!= 0) System.out.print(num);
        }
        System.out.println("\n");
        System.out.println("using queue smallQ for generation exception ");

        for (i=0;i<5;i++){
            System.out.print(" trying to save " + i);
            smallQ.put(i);
            System.out.println();
        }
        System.out.println();
        System.out.print("the queue consists smallQ: ");
        for (i=0;i<5;i++){
            num=smallQ.get();
            if (num!= 0) System.out.print(num);
        }
    }
}
