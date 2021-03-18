package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example283UseTryCatch;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a=0, b=0,c=0;
        Random r = new Random();

        for (int i =0; i<5;i++){
            try {
                b=r.nextInt();
                c = r.nextInt();
                a= 12345/(b/c);
            }catch (ArithmeticException ex){
                System.err.println(/*"divider by zero "*/ex);
                a=0;
            }
            System.out.println("b :" + b);
            System.out.println("c : "+ c);
            System.out.println("a : " + a);
        }
    }
}
