package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example196Recursion.prinrArray;

public class RecursionMain1 {
    public static void main(String[] args) {
        RecTest recTest = new RecTest(10);
        int i ;
        for (i=0;i<10;i++)
            recTest.values[i]=i;
            recTest.printArray(10);
        }

    }

