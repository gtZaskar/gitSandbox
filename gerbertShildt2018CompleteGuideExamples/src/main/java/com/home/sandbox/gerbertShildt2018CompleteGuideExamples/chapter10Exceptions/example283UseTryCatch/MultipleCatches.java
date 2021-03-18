package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter10Exceptions.example283UseTryCatch;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a =args.length;
            System.out.println("a =  "+a);
            int b =42/a;
            int[] c = {1};
            c[42 ] =99;
        }catch (ArithmeticException e ){
            System.out.println("divider by zero " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("after blocks of operators try/catch");
    }
}
