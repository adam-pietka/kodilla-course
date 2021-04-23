package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlightFinderTestSuite {

    @Test
    void testFlighFinder(){
        FlightFinder flightFinderrr = new FlightFinder();

        Flight flightInRAnge = new Flight("Cracow", "Warsaw");
        Flight flightOutOfRange = new Flight("xxx", "Warsaw");
        Flight flightOutOfRange2 = new Flight("xxx", "Qsamo");

        assertDoesNotThrow( ()-> flightFinderrr.findFilght(flightInRAnge));
        assertThrows(RouteNotFoundException.class, () -> flightFinderrr.findFilght(flightOutOfRange) );
        assertThrows(RouteNotFoundException.class, () -> flightFinderrr.findFilght(flightOutOfRange2) );
    }
    // boolean dla  lotów pośrednich true,  więcej niż 2 przesiadki
}
