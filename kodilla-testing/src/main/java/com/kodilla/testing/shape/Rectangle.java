package com.kodilla.testing.shape;

//Public class Circle implements Shape {
  public class Rectangle  implements  Shape{

      private int sideLengthA;
      private int sideLengthB;

    public Rectangle(int sideLengthA, int sideLengthB) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
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