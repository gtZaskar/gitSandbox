package com.home.sandbox.habrExamples.inharitanceExample.threeDimensionalShapes;

public class Main {
    public static void main(String[] args) {
        Shape pyramid = new Pyramid(25, 12);
        Shape cylinder = new Cylinder(2, 100);
        Box box = new Box(599);
        System.out.print(box.add(pyramid));

        System.out.println(pyramid.getVolume());
        System.out.print(box.add(cylinder));
        System.out.println(cylinder.getVolume());
    }
}
