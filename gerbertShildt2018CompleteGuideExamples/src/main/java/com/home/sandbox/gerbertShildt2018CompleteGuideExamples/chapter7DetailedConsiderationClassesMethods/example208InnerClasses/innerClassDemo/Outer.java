package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example208InnerClasses.innerClassDemo;

public class Outer {
   private int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //this is inner class
    class Inner {
        void display() {
            System.out.println(" output : outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new  Outer();
        outer.test();
    }
}
