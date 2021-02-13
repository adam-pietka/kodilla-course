package com.kodilla.exception.test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import  com.kodilla.exception.test.RouteNotFoundException;

import javax.xml.transform.sax.SAXSource;

public class FlightFinder {

    public boolean   findFilght(Flight flight) throws  RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("WARSAW", true);
        flightMap.put("CRACOW", false);
        flightMap.put("CHICAGO", true);
        flightMap.put("WROCLAW", true);
        flightMap.put("BERLIN", false);

        String departure = flight.getDepartureAirport().toUpperCase();
        String arrival = flight.getArrivalAirport().toUpperCase();

        if (flightMap.get(arrival) != null &&  flightMap.get(departure) != null) {
            return  flightMap.get(arrival) && flightMap.get(departure);
        } else {
                throw new RouteNotFoundException("This connection is not allow.");
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flightFinder = new FlightFinder();

        Flight fly0 = new Flight("Warsaw", "chicago");
        Flight fly1 = new Flight("Berlin", "Chicago");
        Flight fly2 = new Flight("Moncaco", "Alcatras");

        try {
            flightFinder.findFilght(fly0);
            System.out.println(flightFinder.findFilght(fly0));

            flightFinder.findFilght(fly1);
            System.out.println(flightFinder.findFilght(fly1));

//            flightFinder.findFilght(fly2);
//            System.out.println(flightFinder.findFilght(fly2));

        } catch (RouteNotFoundException e) {
            e.printStackTrace();
            System.out.println("JAVA is don't STOP");
        } finally {
            System.out.println("End function: " + LocalDateTime.now());
        }

        System.out.println("******* Finally end. ************");
    }
}