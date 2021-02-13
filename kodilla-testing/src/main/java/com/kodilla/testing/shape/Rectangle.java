package com.kodilla.testing.shape;

//Public class Circle implements Shape {
  public class Rectangle  implements  Shape{

      private double sideLengthA;
      private double sideLengthB;

    public Rectangle(double sideLengthA, double sideLengthB) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }

    @Override
      public String getShapeName() {
        return "Rectangle";
      }

      @Override
      public double getField() {

        return sideLengthA * sideLengthB ;
      }
}