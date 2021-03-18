package com.home.sandbox.habrExamples.inharitanceExample.threeDimensionalShapes;

public class Cylinder extends Shape {
    private double height;
    private double baseArea;
    public Cylinder(double height, double baseArea){
        super(baseArea*height);
        this.height=height;
        this.baseArea=baseArea;
    }
}
