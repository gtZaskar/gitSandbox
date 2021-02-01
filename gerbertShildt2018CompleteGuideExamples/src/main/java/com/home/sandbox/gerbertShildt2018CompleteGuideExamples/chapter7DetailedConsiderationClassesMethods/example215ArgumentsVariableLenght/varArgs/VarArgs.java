package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example215ArgumentsVariableLenght.varArgs;

public class VarArgs {
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3,4);
        vaTest();
    }
    static void vaTest(int... v) {
        System.out.print("quantity of arguments: " + v.length + " Consists : ");
        for (int x : v) {
            System.out.print(x + " ");

        }
        System.out.println();

    }
}
