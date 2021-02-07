package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example241UseMethodsOverriding;

public class Rectangle extends Figure {

    Rectangle(double dim1 , double dim2){
        super(dim1, dim2);
    }
    double area (){
        System.out.println("in the area of rectangle ");
        return dim1*dim2;
    }
}
