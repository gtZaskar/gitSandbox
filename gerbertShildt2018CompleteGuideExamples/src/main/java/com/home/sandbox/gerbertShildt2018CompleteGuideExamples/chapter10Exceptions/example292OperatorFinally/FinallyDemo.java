package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example292OperatorFinally;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("in body of method procA().");
            throw new RuntimeException("Demo");

        }finally {
            System.out.println("block of operator finally in method procA()");
        }
    }
    static void procB(){
        try {
            System.out.println("in body of method procB().");
            return;
        }finally {
            System.out.println("block of operator finally in method procB()");
        }
    }
    static void procC(){
        try {
            System.out.println("in body of method procC().");

        }finally {
            System.out.println("block of operator finally in method procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("exception is catch");
        }
        procB();
        procC();
    }
}
