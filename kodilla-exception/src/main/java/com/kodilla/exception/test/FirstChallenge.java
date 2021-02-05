package com.kodilla.exception.test;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e){
                System.out.println("Error for method divide: " + e
                        + " ERROR time: " + Timestamp.valueOf(LocalDateTime.now()));
            } finally {
                System.out.println("End of method \'divide\'." );
            }
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3,0 );

        System.out.println(result);

    }
}