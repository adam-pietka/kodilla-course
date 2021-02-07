package com.kodilla.exception.test;

import java.time.LocalDateTime;

public class SecondChallenge  {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {

        if (x >= 2 || x < 1 || y == 1.5) {
            try{
                throw new ExceptionHandling();
            } catch (ExceptionHandling e) {
                System.out.println("ERROR | occure for: " + e +". Error time: " + LocalDateTime.now() );
                throw new ExceptionHandling();
            } finally {
                System.out.println("Method end at:" + LocalDateTime.now());
            }
        }
        return "Done!";
    }

}