package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example244AbstractClasses.figureExample;

abstract class Figure1 {
    double dim1;
    double dim2;

    public Figure1(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
