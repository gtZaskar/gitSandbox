package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example244AbstractClasses.figureExample;

public class Triangle extends Figure1{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);

    }

        double area() {
            System.out.println("in the area of triangle: ");
            return dim1*dim2/2;
    }
}
