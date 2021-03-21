package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example299ChainException;

class ChainExDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("upper level");
        e.initCause(new ArithmeticException("reason of exception"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("catch exception " + e);
            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("first reason: " + e.getCause());
        }
    }
}