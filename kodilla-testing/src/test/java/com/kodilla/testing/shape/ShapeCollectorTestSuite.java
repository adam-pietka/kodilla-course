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
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @DisplayName("Test of GET_FIGURE method")
    @Test
    void testCaseGetFigure(){
        //Give
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
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
        Square square = new Square(4);
        shapeCollector.addFigure(square);

        //When
        String result = shapeCollector.showFigure();
        //Then
        Assertions.assertEquals("Square", result);
    }

    @DisplayName("Test of method getField")
    @Test
    void testCaseGetField(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        double returnedValue = shapeCollector.fieldForShape(new Rectangle(2,3));
        //Then
        Assertions.assertEquals(4, returnedValue);
    }
}
