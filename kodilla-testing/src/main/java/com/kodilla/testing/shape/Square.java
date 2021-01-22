package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        //System.out.println("Square");
        return null;
    }

    @Override
    public double getField() {
        // body ???
        return 4.0;
    }
}