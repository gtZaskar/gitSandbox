package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example224PracticalExtends;

public class Box { //page 224
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }
}
