package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Give
        int [] testTable0 =  new int[]{102, 52, 36, 265, 6};

        //When
        double resultTest =  ArrayOperations.getAverage(testTable0);

        //Then
        System.out.println("Returned values is: "  + resultTest);
        Assertions.assertEquals(92.2, resultTest);

    }

}
