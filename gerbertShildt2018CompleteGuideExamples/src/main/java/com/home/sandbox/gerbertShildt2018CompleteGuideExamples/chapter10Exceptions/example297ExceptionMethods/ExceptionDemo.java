package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example297ExceptionMethods;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("called method compute (" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normal end");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("exception catch : " + e);
        }
    }
}

