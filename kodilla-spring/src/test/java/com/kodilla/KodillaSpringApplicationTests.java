package com.kodilla;

import com.kodilla.spring.shape.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = context.getBean(Circle.class);
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = context.getBean(Triangle.class);
        Shape shape = (Shape)context.getBean("triangle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @Test
    void testSquareLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = context.getBean(Square.class);
        Shape shape = (Shape)context.getBean("createSquare");
        //whene

        String name = shape.getShapeName();
        //then
        assertEquals("This is a square.", name);

    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }


    @Test
    void contextLoads() {
    }

}
