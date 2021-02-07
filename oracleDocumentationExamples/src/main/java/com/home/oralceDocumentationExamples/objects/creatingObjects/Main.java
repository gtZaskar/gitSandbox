package main.java.com.home.oralceDocumentationExamples.objects.creatingObjects;

public class Main {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);

        Rectangle rectangle1 = new Rectangle(originOne,100, 200);
        Rectangle rectangle2 = new Rectangle( 50, 100);
        System.out.println(rectangle1.area());

    }
}
