package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example208InnerClasses.innerClassDemo1;

public class Outer {
    int outer_x = 100;

    void  test(){
        for (int i =0; i<10; i++){
            class Inner {
                void display (){
                    System.out.println(" output : outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo1{
    public static void main(String[] args) {
        Outer outer =new Outer();
        outer.test();
    }
}
