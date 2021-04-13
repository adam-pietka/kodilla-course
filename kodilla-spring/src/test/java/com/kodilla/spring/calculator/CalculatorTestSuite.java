package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd(){
        //Given
        double result =  calculator.add(200.0, 2.1234);
        //When
        assertEquals(202.1234, result);
//Then
    }

    @Test
    void testSub(){
        //given & when
        double result =  calculator.sub(5.0, 2.2);
        //then
        assertEquals(2.8, result);
    }

    @Test
    void testMul(){
        //given & when
        double result =  calculator.mul(4.5, 5.0);
        //then
        assertEquals(22.5,result);
    }

    @Test
    void testDiv(){
        //given & when
        double result =  calculator.div(209.0, 5.5);
        //then
        assertEquals(38.0, result);
    }
}