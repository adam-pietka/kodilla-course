package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void writeSomethingToLogger(){
//        logger = new Logger();
        logger = Logger.LOGGER;
        logger.log("Lorem ipsum");
    }

    @Test
    void testGetLastLog(){
        //g
        //when
        String result = logger.getLastLog();
        //then

        assertEquals("Lorem ipsum", result);
    }

}
/*, a w nim testy sprawdzające działanie metody getLastLog() klasy Logger.
 Aby to przetestować, zapisz coś wcześniej do logów przy pomocy metody log(String log).

 */