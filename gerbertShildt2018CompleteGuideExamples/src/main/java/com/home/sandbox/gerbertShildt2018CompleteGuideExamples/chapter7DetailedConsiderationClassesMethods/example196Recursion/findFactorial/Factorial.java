package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example196Recursion.findFactorial;

public class Factorial {
    int fact (int n ){
        int result;

        if (n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}
