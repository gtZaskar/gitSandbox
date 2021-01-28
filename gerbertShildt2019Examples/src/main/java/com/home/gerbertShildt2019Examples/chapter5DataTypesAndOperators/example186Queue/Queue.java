package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example186Queue;

public class Queue {
    char[] q; //array for saving elements of queue
    int putloc, getloc; //indexes for putting and getting of elements queue

    Queue(int size) {
        q = new char[size]; //memory size for queue
        putloc = getloc = 0;
    }

    // putting indexes in queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full ");
            return;
        }
        q[putloc++] = ch;
    }
    // getting indexes for queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty ");
            return (char) 0;
        }
        return q[getloc++];
    }

}

