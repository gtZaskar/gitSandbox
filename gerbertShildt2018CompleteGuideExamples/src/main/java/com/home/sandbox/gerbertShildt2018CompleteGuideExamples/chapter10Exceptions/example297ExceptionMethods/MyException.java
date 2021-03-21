package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example297ExceptionMethods;

class MyException extends Exception {
    private int detail;

    MyException (int a){
        this.detail=a;
    }

    public String toString (){
        return "MyException [" + detail + "]";
    }
}
