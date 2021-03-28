package com.kodilla.good.patterns.airlines;

import java.util.List;

public class AirlinesApplication {
    public static void main(String[] args) {
        FlyFinder flyFinder = new FlyFinder();

       /* List<String> resultDeparture =  flyFinder.findFlyForDeparture("Warszawa");
        for (String i: resultDeparture             ) {
            System.out.println("available departure: " + i);
        }

        List<String> resultArr = flyFinder.findFlyForArrivals("RADOM");
        for (String i: resultArr             ) {
            System.out.println("available Arrival: " + i);
        }

        List<String> resultThr =  flyFinder.findFlyCinnectionFromTo("warszawa", "radom");
        if (resultThr.size() > 0){
            for (String i: resultThr             ) {
                System.out.println("available through: " + i);
            }
        } else {
            System.out.println("Connection is not available, sorry.");
        }*/

        List<String> resultDepartureH =  flyFinder.findFlyForDepartureHASH("krakow");
        for (String i: resultDepartureH             ) {
            System.out.println("available departure HASH: " + i);
        }

    }
}
