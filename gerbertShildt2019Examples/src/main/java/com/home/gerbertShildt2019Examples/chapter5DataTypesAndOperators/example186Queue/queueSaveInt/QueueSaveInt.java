package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example186Queue.queueSaveInt;

public class QueueSaveInt {
    int[] q; //array for saving elements of queue
    int putloc, getloc; //indexes for putting and getting of elements queue

    QueueSaveInt(int size) {
        q = new int[size]; //memory size for queue
        putloc = getloc = 0;
    }

    // putting indexes in queue
    void put(int numbers) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full ");
            return;
        }
        q[putloc++] = numbers;
    }
    // getting indexes for queue
    int get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty ");
            return 0;
        }
        return q[getloc++];
    }

}

