package com.kodilla.testing.shape;

import java.text.DecimalFormat;

public class Circle implements Shape {

    private double circleRadius ;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double getField() {
        double aa = (Math.round((Math.PI * Math.pow(circleRadius, 2) * 1000)))  ;
        return aa / 1000;

//    return () / 100;

    }

    @Override
    public String getShapeName() {
        //System.out.println("Circle");
        return "Circle";
    }
}
