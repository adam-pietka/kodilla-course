package com.kodilla.good.patterns.airlines;

import java.util.List;

public class AirlinesApplication {
    public static void main(String[] args) {
        FlyFinder flyFinder = new FlyFinder();


//

        List<String> arrivalList =  flyFinder.findFlyForArrivalsHASH("Radom");
        if (arrivalList.size()==0 ){
            System.out.println("Sorry we don't have such connection.");
        } else {
            System.out.println("Hello," +
                    "\nAvailable arrival to chosen city, are available from:");
            for (String i: arrivalList){
                System.out.println(" - " + i);
            }
            System.out.println();
        }

        List<String> departureList = flyFinder.findFlyForDepartureHASH("warszawa");
        if (departureList.size()==0 ){
            System.out.println("Sorry we don't have such connection.");
        } else {
            System.out.println("Hello," +
                    "\nAvailable departure from chosen city, are available to:");
            for (String i: departureList){
                System.out.println(" - " + i);
            }
            System.out.println();
        }

        List<String>  throughList= flyFinder.findFlyCinnectionFromToHash("Warszawa", "Radom");
        if (throughList.size()==0 ){
            System.out.println("Sorry we don't have such connection. Through other city.");
        } else {
            System.out.println("Hello," +
                    "\nTo chosen city, you can go through:");
            for (String i: throughList){
                System.out.println(" - " + i);
            }
        }

    }
}
