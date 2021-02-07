package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example244AbstractClasses.figureExample;

import main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example241UseMethodsOverriding.Figure;

public class Rectangle extends Figure1 {

   Rectangle (double dim1, double dim2){
       super(dim1,dim2);
    }
    double area(){
        System.out.println("in the area of rectangle : ");
        return dim1*dim2;

    }
}

