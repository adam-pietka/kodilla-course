package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double circleRadius ;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double getField() {
        // do impmementacji
        return 2.2;
    }

    @Override
    public String getShapeName() {
        //System.out.println("Circle");
        return "Square";
    }
}
