package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd(){
        //Given
        calculator.add(200.8, 2.1234);
        //When
        //Then
    }

    @Test
    void testSub(){

        calculator.sub(5.0, 2.2);
    }

    @Test
    void testMul(){
        calculator.mul(4.5, 5.0);
    }

    @Test
    void testDiv(){
        calculator.div(200.0, 5.5);
    }
}