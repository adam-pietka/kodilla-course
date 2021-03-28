package com.kodilla.good.patterns.airlines;

public class AirlinesApplication {
    public static void main(String[] args) {
        FlyFinder flyFinder = new FlyFinder();
//        flyFinder.findFlyForDeparture("Warszawa");
//        flyFinder.findFlyForArrivals("RADOM");
        flyFinder.findFlyCinnectionFromTo("warszawa", "Radom");

    }
}
