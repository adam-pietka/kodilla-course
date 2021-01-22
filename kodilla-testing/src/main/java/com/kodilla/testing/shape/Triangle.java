package com.kodilla.testing.shape;

public class Triangle implements  Shape{
    private int height;
    private int baseLength;

    public Triangle(int height, int baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}
