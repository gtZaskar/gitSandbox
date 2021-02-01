package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example215ArgumentsVariableLenght.overloadVarArgs;

public class OverloadVarArgs {
    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Check",10,20);
        vaTest(true,false,true);
    }
    static void vaTest(int... v) {
        System.out.print("vaTest(in ...) : " +
                "quantity of arguments: " +
                v.length + " Consists : ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...) : " +
                "quantity of arguments: " +
                v.length + " Consists : ");
        for (boolean x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int...) : " +
                msg + v.length + " Consists : ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
}
