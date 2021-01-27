package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape){
        //shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        // body
        return  false;
    }

    public Shape getFigure(int n){
        return  null;
        //return shapes.get(n);
    }

    public String showFigure(){
        // shape name in one String
        return "trójkąty i kwadraty...";
    }

    public int getShapeQuantity(){
        //body
        return 100;
    }

    public double fieldForShape (Shape shape){
        return shape.getField();
    }

}


/*
Utwórz klasę ShapeCollector z metodami:
addFigure(Shape shape),
removeFigure(Shape shape),
getFigure(int n) oraz
showFigures().

5. W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.
6.
* */