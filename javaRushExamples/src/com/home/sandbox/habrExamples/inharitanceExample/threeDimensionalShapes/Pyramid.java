package com.home.sandbox.habrExamples.inharitanceExample.threeDimensionalShapes;

public class Pyramid extends Shape {
    private double height;
    private double baseArea;

    public Pyramid( double height,double baseArea){
        super(height*baseArea*4/3);
        this.height=height;
        this.baseArea=baseArea;
    }
}
