package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean removeFigureResult = false;
        if (shapes.remove(shape)){
            removeFigureResult = true;
        }
        return  removeFigureResult;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigure(){
        String allShapesNames = "";
        for (int i = 0; i < shapes.size();i++){
         if ( i == 0 ){
             allShapesNames = shapes.get(i).getShapeName() ;
         } else {
         allShapesNames = allShapesNames + ", " + shapes.get(i).getShapeName();
         }
        }
        return  allShapesNames;
    }

    public int getShapeQuantity(){
        return shapes.size();
    }

    public double fieldForShape (Shape shape){
        return shape.getField();
    }

}