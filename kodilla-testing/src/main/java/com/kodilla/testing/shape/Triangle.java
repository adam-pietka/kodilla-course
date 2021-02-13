package com.kodilla.testing.shape;

public class Triangle implements  Shape{
    private double height;
    private double baseLength;

    public Triangle(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (height * baseLength ) / 2 ;
    }
}