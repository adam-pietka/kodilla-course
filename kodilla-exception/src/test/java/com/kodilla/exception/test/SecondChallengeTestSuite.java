package com.kodilla.exception.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        //assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(1.1, 1.5));
        assertAll(
                ()-> assertDoesNotThrow( ()-> secondChallenge.probablyIWillThrowException(1.8, 3.0)),
                ()-> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(0.9999, 5.0)),
                ()-> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(2, 5.0)),
                ()-> assertThrows(ExceptionHandling.class, ()-> secondChallenge.probablyIWillThrowException(1.7, 1.5))
        );
    }
}
