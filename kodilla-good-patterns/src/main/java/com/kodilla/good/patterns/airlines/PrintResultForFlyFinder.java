package com.kodilla.good.patterns.airlines;

import java.util.List;

public class PrintResultForFlyFinder {

    public void printForArrival( String arrivalCity, List<String> arrivalList){
        if (arrivalList.size()==0 ){
            System.out.println("Sorry we don't have such connection.");
        } else {
            System.out.println("Hello," +
                    "\nAvailable arrival to: " + arrivalCity + ", are available from:");
            for (String i: arrivalList){
                System.out.println(" - " + i);
            }
        }
    }

    public void printForDeparture( String arrivalCity, List<String> departureList){
        if (departureList.size()==0 ){
            System.out.println("Sorry we don't have such connection.");
        } else {
            System.out.println("Hello," +
                    "\nAvailable departure from: " + arrivalCity + ", are available to:");
            for (String i: departureList){
                System.out.println(" - " + i);
            }
        }
    }

    public void printThroughAirport( String departureCity, String arrivalCity ,List<String> throughList){
        if (throughList.size()==0 ){
            System.out.println("Sorry we don't have such connection.");
        } else {
            System.out.println("Hello," +
                    "\nFrom: " + departureCity + ", to " + arrivalCity + ", you can go through:");
            for (String i: throughList){
                System.out.println(" - " + i);
            }
        }
    }
}
