package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example241UseMethodsOverriding;

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10,10);
        Rectangle rectangle = new Rectangle(9,5);
        Triangle triangle = new Triangle(10,8);
        Figure figref;

        figref = figure;
        System.out.println("area equals " + figref.area());
        figref=rectangle;
        System.out.println("area equals " + figref.area());
        figref=triangle;
        System.out.println("area equals " + figref.area());

    }
}
