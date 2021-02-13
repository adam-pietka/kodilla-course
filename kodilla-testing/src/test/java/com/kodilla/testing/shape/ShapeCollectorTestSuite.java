package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("TDD: Test Suite for ShapeCollection.")
public class ShapeCollectorTestSuite {

    private static int testCounter;

    @BeforeEach
    public void beforeEach(){
        System.out.println("This is begin of test # " + testCounter);
    }
    @AfterEach
    public  void afterEach(){
        System.out.println("This is end of test no. # " + testCounter);
        testCounter ++;
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite : BEGIN!!!");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: tests has been FINISHED");
    }

    @DisplayName("Test ADD method.")
    @Test
    void testCaseAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(1,shapeCollector.getShapeQuantity());
    }
    @DisplayName("Test of REMOVAL method")
    @Test
    void testCaseRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);

        //When & Then
        Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
        Assertions.assertTrue(shapeCollector.removeFigure(square));
        Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @DisplayName("Test for method - GET_FIGURE ")
    @Test
    void testCaseGetFigure(){
        //Give
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3.0);
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals( circle, result );
    }

    @DisplayName("Test of SHOW_FIGURES method")
    @Test
    void testCaseShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Rectangle(2.0,3.0));     //0
        shapeCollector.addFigure(new Square(3.0));                       //1
        shapeCollector.addFigure(new Circle(10.0));                     //2
        shapeCollector.addFigure(new Triangle(3.0, 2.0));         //3

        //When
        String result = shapeCollector.showFigure();
        String   shapesList = shapeCollector.showFigure();

        //Then
        Assertions.assertEquals("Rectangle, Square, Circle, Triangle", shapesList);
    }

    @DisplayName("Test of method getField")
    @Test
    void testCaseGetField(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Rectangle(2.0,3.0));     //0
        shapeCollector.addFigure(new Square(3.0));                       //1
        shapeCollector.addFigure(new Circle(10.0));                     //2
        shapeCollector.addFigure(new Triangle(3.0, 2.0));         //3

        //When
        double returnedRectangle =  shapeCollector.getFigure(0).getField();
        double returnedSquare   = shapeCollector.getFigure(1).getField();
        double returnedCircle = shapeCollector.getFigure(2).getField();
        double returnedTriangle = shapeCollector.getFigure(3).getField();

        //Then
        Assertions.assertEquals(6, returnedRectangle);
        Assertions.assertEquals(9,returnedSquare);
        Assertions.assertEquals(314.159, returnedCircle);
        Assertions.assertEquals(3,returnedTriangle);

    }
}
