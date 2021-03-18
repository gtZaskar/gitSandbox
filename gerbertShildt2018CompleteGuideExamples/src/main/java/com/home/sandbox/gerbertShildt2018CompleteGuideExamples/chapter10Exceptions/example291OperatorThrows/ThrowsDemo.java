package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example291OperatorThrows;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("in body of method throwOne().");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("catch exception : " + e);
        }
    }
}
