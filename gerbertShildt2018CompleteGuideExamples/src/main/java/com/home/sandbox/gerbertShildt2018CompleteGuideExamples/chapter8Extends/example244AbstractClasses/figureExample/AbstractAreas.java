package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example244AbstractClasses.figureExample;

import main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example241UseMethodsOverriding.Figure;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(9,5);
        Triangle triangle =new Triangle(10,8);
        //Figure1 figure1 = new Figure1(10,10); it is wrong!!!
        Figure1  figref; //right, but object does not create

        figref = rectangle;
        System.out.println("area equal : " + figref.area());
        figref = triangle;
        System.out.println("area equal : " + figref.area());
    }
}
