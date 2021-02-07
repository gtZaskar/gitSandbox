package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example241UseMethodsOverriding;

public class Figure {
     double dim1;
     double dim2;

    Figure (double dim1, double dim2){
        this.dim1 =dim1;
        this.dim2 = dim2;
    }

      double area(){
        System.out.println("area of figure is not recognize");
        return 0;
    }
}
